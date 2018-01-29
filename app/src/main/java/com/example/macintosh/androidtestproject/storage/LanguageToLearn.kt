package com.example.macintosh.androidtestproject.storage
import com.example.macintosh.androidtestproject.model.LanguageToLearnEntity

/**
 * Created by macintosh on 1/28/18.
 */
public class LanguageToLearn{

    var languagesToLearnEntityList:ArrayList<LanguageToLearnEntity> = arrayListOf<LanguageToLearnEntity>()

    constructor() {
        //this.languageToLearn.add(new LanguageToLearn(1, "ENG", "Ingles", "FlagUSA", true))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(1, "ENG", "Inglés", "English","FlagUSA", true,false))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(2, "FRA", "Francés", "French","FlagFRA", true,true))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(3, "POR", "Portugués", "Portuguese","FlagPOR", true,true))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(4, "GER", "Alemán", "German","FlagGER", true,true))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(5, "CHI", "Chino", "Chinese","FlagCHI", true,true))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(6, "JAP", "Japonés", "Japanese","FlagJAP", false,true))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(7, "KOR", "Coreano", "Korean","FlagJAP", false,true))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(8, "ITA", "Italiano", "Italian","FlagITA", true,false))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(9, "CAT", "Catalán", "Catalan","FlagCAT", true,false))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(10, "ESP", "Esperanto", "Esperanto","FlagGLOBAL", true,false))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(11, "GUA", "Guaraní", "Guarani","FlagGUA", true,false))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(12, "DUT", "Holandés", "Dutch","FlagDUT", true,true))
        this.languagesToLearnEntityList.add(LanguageToLearnEntity(13, "IRI", "Irlandés", "Irish","FlagIRI", false,true))

        print("languagesToLearnEntityList: "+languagesToLearnEntityList.toString())

    }
}