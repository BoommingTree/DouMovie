package com.colin.doumovie.view.imp

import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.colin.doumovie.R
import com.colin.doumovie.adapter.HotScreenListAdapter
import com.colin.doumovie.bean.HotScreenResult
import com.colin.doumovie.presenter.HotScreenPresenter
import com.colin.doumovie.presenter.imp.HotScreenPresenterImp
import com.colin.doumovie.view.BaseFragment
import com.colin.doumovie.view.HotScreenView

/**
 * Created by tianweiping on 2017/12/18.
 */
class HotScreenFragment : BaseFragment(), HotScreenView {

    private var mAdapter: HotScreenListAdapter? = null
    private var mData: MutableList<HotScreenResult.SubjectsBean> = mutableListOf()
    private var presenter: HotScreenPresenter? = null

    override fun getLayoutId(): Int {
        return R.layout.fragment_hot_screen_layout
    }

    /**
     *  初始化view
     */
    override fun initView() {
        mAdapter = HotScreenListAdapter(context, mData)
        val rcView: RecyclerView = contentView?.findViewById(R.id.hot_rcView) as RecyclerView
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcView.layoutManager = layoutManager
        rcView.adapter = mAdapter
        presenter = HotScreenPresenterImp(this)
        presenter?.onAttach(context)
        presenter?.loadData(1, 10)
    }

    override fun initEvent() {
        mAdapter?.setOnItemClickListener { _, position ->
            toMovieDetailAct(position)
        }

        mAdapter?.setOnItemBtnClickListener { _, position ->
            showTipMessage(1, "点击了按钮$position")
        }
    }

    override fun notifyList(data: HotScreenResult) {
        mData.clear()
        mData.addAll(data.getSubjects()!!)
        mAdapter?.notifyDataSetChanged()
    }

    override fun toMovieDetailAct(position: Int) {
        val intent = Intent(activity, MovieDetailAct::class.java)
        intent.putExtra("id", mData[position].id)
        startActivity(intent)
    }
}