package emre.turhal.weatherapi.retrofit

import emre.turhal.weatherapi.model.CurrentWeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("current.json")
    fun getCurrentWeather(
        @Query("key") key: String = "3a2e1347e9cb4cc2b1b172351232006",
        @Query("q") city: String,
        @Query("aqi") aqi: String = "no"
        ): Call<CurrentWeatherResponse>

}