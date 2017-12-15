package com.colin.doumovie

import android.os.Handler
import android.support.v7.app.ActionBarDrawerToggle
import com.colin.doumovie.view.BaseActivity
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun getContentViewId(): Int {
        return R.layout.activity_main
    }

    /**
     *  初始化view
     */
    override fun initView() {
        setToolBarTitle("主页")
        showLoading()
        Handler().postDelayed({ dismissLoading() }, 2000)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        //创建返回键，并实现打开关/闭监听
        val dt = ActionBarDrawerToggle(this, main_draw, base_toolbar, R.string.open, R.string.close)
        dt.syncState()
        main_draw.addDrawerListener(dt)
    }

}
