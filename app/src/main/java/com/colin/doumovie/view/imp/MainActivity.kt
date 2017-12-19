package com.colin.doumovie.view.imp

import android.support.v4.app.Fragment
import android.support.v7.app.ActionBarDrawerToggle
import com.colin.doumovie.R
import com.colin.doumovie.view.BaseActivity
import com.colin.doumovie.view.MainView
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainView {

    private var fragmentMap: HashMap<String, Fragment>? = null

    override fun getContentViewId(): Int {
        return R.layout.activity_main
    }

    /**
     *  初始化view
     */
    override fun initView() {
        setToolBarTitle("主页")
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        val dt = ActionBarDrawerToggle(this, main_draw, base_toolbar, R.string.open, R.string.close)
        dt.syncState()
        main_draw.addDrawerListener(dt)
        //初始化第一个fragment
        fragmentMap = HashMap()
        showLoading()
        val hotF = HotScreenFragment()
        fragmentMap?.put("hotF", hotF)
        supportFragmentManager.beginTransaction().add(R.id.main_content_layout, hotF, "hotF").commit()
        setToolBarTitle(getString(R.string.menu_hot))
        dismissLoading()
    }

    override fun initEvent() {
        main_navigation.setNavigationItemSelectedListener {
            switchFragment(it.itemId)
            true
        }
    }


    override fun switchFragment(id: Int) {

    }

}
