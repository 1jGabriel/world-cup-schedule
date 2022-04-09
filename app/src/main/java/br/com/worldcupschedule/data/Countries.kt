package br.com.worldcupschedule.data

import br.com.worldcupschedule.model.Country
import br.com.worldcupschedule.model.GroupTypeEnum


object Countries {
    private const val BASE_URL_FLAG = "https://countryflagsapi.com/png/"
    fun getCountries() = listOf(
        Country(group = GroupTypeEnum.GROUP_A, name = "Catar", flagUrl = "${BASE_URL_FLAG}qatar"),
        Country(group = GroupTypeEnum.GROUP_A, name = "Equador", flagUrl = "${BASE_URL_FLAG}ecuador"),
        Country(group = GroupTypeEnum.GROUP_A, name = "Senegal", flagUrl = "${BASE_URL_FLAG}senegal"),
        Country(group = GroupTypeEnum.GROUP_A, name = "Holanda", flagUrl = "${BASE_URL_FLAG}netherlands"),
        Country(group = GroupTypeEnum.GROUP_B, name = "Inglaterra", flagUrl = "${BASE_URL_FLAG}england"),
        Country(group = GroupTypeEnum.GROUP_B, name = "Irã", flagUrl = "${BASE_URL_FLAG}iran"),
        Country(group = GroupTypeEnum.GROUP_B, name = "Estados Unidos", flagUrl = "${BASE_URL_FLAG}usa"),
        Country(group = GroupTypeEnum.GROUP_B, name = "Repescagem Europa", flagUrl = "${BASE_URL_FLAG}eur"),
        Country(group = GroupTypeEnum.GROUP_C, name = "Argentina", flagUrl = "${BASE_URL_FLAG}argentina"),
        Country(group = GroupTypeEnum.GROUP_C, name = "Arábia Saudita", flagUrl = "${BASE_URL_FLAG}sau"),
        Country(group = GroupTypeEnum.GROUP_C, name = "México", flagUrl = "${BASE_URL_FLAG}mexico"),
        Country(group = GroupTypeEnum.GROUP_C, name = "Polônia", flagUrl = "${BASE_URL_FLAG}poland"),
        Country(group = GroupTypeEnum.GROUP_D, name = "França", flagUrl = "${BASE_URL_FLAG}france"),
        Country(
            group = GroupTypeEnum.GROUP_D,
            name = "Repescagem Internacional 1",
            flagUrl = "${BASE_URL_FLAG}eur"
        ),
        Country(group = GroupTypeEnum.GROUP_D, name = "Dinamarca", flagUrl = "${BASE_URL_FLAG}denmark"),
        Country(group = GroupTypeEnum.GROUP_D, name = "Tunísia", flagUrl = "${BASE_URL_FLAG}tunisia"),
        Country(group = GroupTypeEnum.GROUP_E, name = "Espanha", flagUrl = "${BASE_URL_FLAG}spain"),
        Country(
            group = GroupTypeEnum.GROUP_E,
            name = "Repescagem Internacional 2",
            flagUrl = "${BASE_URL_FLAG}eur"
        ),
        Country(group = GroupTypeEnum.GROUP_E, name = "Alemanha", flagUrl = "${BASE_URL_FLAG}germany"),
        Country(group = GroupTypeEnum.GROUP_E, name = "Japão", flagUrl = "${BASE_URL_FLAG}japan"),
        Country(group = GroupTypeEnum.GROUP_F, name = "Bélgica", flagUrl = "${BASE_URL_FLAG}belgium"),
        Country(group = GroupTypeEnum.GROUP_F, name = "Canadá", flagUrl = "${BASE_URL_FLAG}canada"),
        Country(group = GroupTypeEnum.GROUP_F, name = "Marrocos", flagUrl = "${BASE_URL_FLAG}morocco"),
        Country(group = GroupTypeEnum.GROUP_F, name = "Croácia", flagUrl = "${BASE_URL_FLAG}croatia"),
        Country(group = GroupTypeEnum.GROUP_G, name = "Brasil", flagUrl = "${BASE_URL_FLAG}brazil"),
        Country(group = GroupTypeEnum.GROUP_G, name = "Sérvia", flagUrl = "${BASE_URL_FLAG}serbia"),
        Country(group = GroupTypeEnum.GROUP_G, name = "Suíça", flagUrl = "${BASE_URL_FLAG}switzerland"),
        Country(group = GroupTypeEnum.GROUP_G, name = "Camarões", flagUrl = "${BASE_URL_FLAG}cameroon"),
        Country(group = GroupTypeEnum.GROUP_H, name = "Portugal", flagUrl = "${BASE_URL_FLAG}portugal"),
        Country(group = GroupTypeEnum.GROUP_H, name = "Gana", flagUrl = "${BASE_URL_FLAG}ghana"),
        Country(group = GroupTypeEnum.GROUP_H, name = "Uruguai", flagUrl = "${BASE_URL_FLAG}uruguay"),
        Country(group = GroupTypeEnum.GROUP_H, name = "Coréia do sul", flagUrl = "${BASE_URL_FLAG}kor"),
    )
}