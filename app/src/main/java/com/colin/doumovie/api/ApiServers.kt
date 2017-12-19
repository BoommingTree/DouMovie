package com.colin.doumovie.api

import com.colin.doumovie.bean.HotScreenResult
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * Created by tianweiping on 2017/12/18.
 */
interface ApiServers {

    /**
     * 获取正在上映的数据
     */
    @GET(BaseURL.HOTSCREEN)
    fun getHotScreenList(@QueryMap par: HashMap<String, String>): Observable<HotScreenResult>
}