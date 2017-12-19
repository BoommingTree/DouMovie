package com.colin.doumovie.view.imp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.colin.doumovie.R
import com.colin.doumovie.view.MovieDetailView

/**
 * 特殊的activity所以不继承
 */
class MovieDetailAct : AppCompatActivity(), MovieDetailView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        initView()
        initEvent()
    }

    override fun initView() {

    }

    override fun initEvent() {
    }

    override fun showLoading() {

    }

    override fun dismissLoading() {
    }

    override fun showTipMessage(code: Int, msg: String) {
    }

    override fun getContext(): Context {
        return this
    }

    override fun getNetKey(): String {
        return javaClass.simpleName
    }

    override fun toLoginActBySessionError() {

    }
}
