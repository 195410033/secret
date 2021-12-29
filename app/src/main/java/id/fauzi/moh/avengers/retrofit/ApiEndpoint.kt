package id.fauzi.moh.avengers.retrofit

import id.fauzi.moh.avengers.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET( "506fa0a9-7ef5-49ca-a0e4-2ea48288eb00")
    fun getData(): Call<MainModel>

}