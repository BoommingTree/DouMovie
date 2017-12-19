package com.colin.doumovie.bean

/**
 * Created by tianweiping on 2017/12/19.
 */
class MovieDetailResult {

    private var rating: RatingBean? = null//评分信息
    private var images: ImagesBean? = null //头部的海报图
    private var year: String? = null //年份
    private var id: String? = null //id
    private var mobile_url: String? = null //分享出去的链接
    private var photos_count: Int = 0 //剧照数量
    private var title: String? = null //影片标题
    private var share_url: String? = null//分享url
    private var summary: String? = null//简介
    private var comments_count: Int = 0
    private var ratings_count: Int = 0//评分数量
    private var writers: List<WritersBean>? = null//编剧们
    private var pubdates: List<String>? = null//上映地区
    private var tags: List<String>? = null //想看的标签
    private var durations: List<String>? = null//时长
    private var genres: List<String>? = null//分类
    private var trailer_urls: List<String>? = null
    private var casts: List<CastsBean>? = null//演员们
    private var photos: List<PhotosBean>? = null
    private var directors: List<CastsBean>? = null//导演们

//    fun getDirectors(): List<CastsBean>? {
//        return directors
//    }
//
//    fun setDirectors(directors: List<CastsBean>) {
//        this.directors = directors
//    }
//
//    fun getRating(): RatingBean? {
//        return rating
//    }
//
//    fun setRating(rating: RatingBean) {
//        this.rating = rating
//    }
//
//
//    fun getImages(): ImagesBean? {
//        return images
//    }
//
//    fun setImages(images: ImagesBean) {
//        this.images = images
//    }
//
//    fun getYear(): String? {
//        return year
//    }
//
//    fun setYear(year: String) {
//        this.year = year
//    }
//
//
//    fun getId(): String? {
//        return id
//    }
//
//    fun setId(id: String) {
//        this.id = id
//    }
//
//    fun getMobile_url(): String? {
//        return mobile_url
//    }
//
//    fun setMobile_url(mobile_url: String) {
//        this.mobile_url = mobile_url
//    }
//
//    fun getPhotos_count(): Int {
//        return photos_count
//    }
//
//    fun setPhotos_count(photos_count: Int) {
//        this.photos_count = photos_count
//    }
//
//
//    fun getTitle(): String? {
//        return title
//    }
//
//    fun setTitle(title: String) {
//        this.title = title
//    }
//
//
//    fun getShare_url(): String? {
//        return share_url
//    }
//
//    fun setShare_url(share_url: String) {
//        this.share_url = share_url
//    }
//
//
//    fun getSummary(): String? {
//        return summary
//    }
//
//    fun setSummary(summary: String) {
//        this.summary = summary
//    }
//
//
//    fun getComments_count(): Int {
//        return comments_count
//    }
//
//    fun setComments_count(comments_count: Int) {
//        this.comments_count = comments_count
//    }
//
//    fun getRatings_count(): Int {
//        return ratings_count
//    }
//
//    fun setRatings_count(ratings_count: Int) {
//        this.ratings_count = ratings_count
//    }
//
//
//    fun getWriters(): List<WritersBean>? {
//        return writers
//    }
//
//    fun setWriters(writers: List<WritersBean>) {
//        this.writers = writers
//    }
//
//    fun getPubdates(): List<String>? {
//        return pubdates
//    }
//
//    fun setPubdates(pubdates: List<String>) {
//        this.pubdates = pubdates
//    }
//
//    fun getTags(): List<String>? {
//        return tags
//    }
//
//    fun setTags(tags: List<String>) {
//        this.tags = tags
//    }
//
//    fun getDurations(): List<String>? {
//        return durations
//    }
//
//    fun setDurations(durations: List<String>) {
//        this.durations = durations
//    }
//
//    fun getGenres(): List<String>? {
//        return genres
//    }
//
//    fun setGenres(genres: List<String>) {
//        this.genres = genres
//    }
//
//
//    fun getTrailer_urls(): List<String>? {
//        return trailer_urls
//    }
//
//    fun setTrailer_urls(trailer_urls: List<String>) {
//        this.trailer_urls = trailer_urls
//    }
//
//
//    fun getCasts(): List<CastsBean>? {
//        return casts
//    }
//
//    fun setCasts(casts: List<CastsBean>) {
//        this.casts = casts
//    }
//
//
//    fun getPhotos(): List<PhotosBean>? {
//        return photos
//    }
//
//    fun setPhotos(photos: List<PhotosBean>) {
//        this.photos = photos
//    }

    class WritersBean {

        var avatars: AvatarsBean? = null
        var name_en: String? = null
        var name: String? = null
        var alt: String? = null
        var id: String? = null

        class AvatarsBean {
            var small: String? = null
            var large: String? = null
            var medium: String? = null
        }
    }

    class PhotosBean {

        var thumb: String? = null
        var image: String? = null
        var cover: String? = null
        var alt: String? = null
        var id: String? = null
        var icon: String? = null
    }
}