package com.example.ceria.network

import com.example.ceria.BuildConfig
import com.example.ceria.data.response.UserResponse
import com.example.ceria.network.API.BASE_URL
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


object API {
    const val v1 = "v1/"
    const val BASE_URL = BuildConfig.BASE_URL
    //const val APIKEY = BuildConfig.APIKEY
    //const val ENV = BuildConfig.ENV

    // inside of any of your application's code
    var consumerKey: String = BuildConfig.CONSUMER_KEY
    var consumerSecret: String = BuildConfig.CONSUMER_SECRET

    const val PHONE = "phone_number"
    const val PIN = "pin"
    const val SEARCH = "search"
    const val USERS = "users"

    //const val SIGNUP = v1 + "registrations/initiate" + APIKEY

}