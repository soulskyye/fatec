package br.com.beblue.fatec.livecoding.network

import br.com.beblue.fatec.livecoding.domain.Company
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by viking on 07/11/17.
 */
interface CompanyService {

    @GET("/v1/cnpj/{cnpj}")
    fun getCompany(@Path("cnpj") cnpj: String): Call<Company>

}