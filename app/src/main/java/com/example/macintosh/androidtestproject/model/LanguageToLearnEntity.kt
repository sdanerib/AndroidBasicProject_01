package com.example.macintosh.androidtestproject.model

/**
 * Created by macintosh on 1/28/18.
 */
class LanguageToLearnEntity {

    var id :Int
    var languageAbbr :String
    var languageNameSpa :String
    var languageNameEng :String
    var languageImgFlag:Any
    var languageAvailableSpanish :Boolean
    var languageAvailableEnglish :Boolean

    constructor(id: Int, languageAbbr: String, languageNameSpa: String, languageNameEng:String,languageImgFlag: Any, languageAvailableSpa: Boolean, languageAvailableEng: Boolean) {
        this.id = id
        this.languageAbbr = languageAbbr
        this.languageNameSpa = languageNameSpa
        this.languageNameEng = languageNameEng
        this.languageImgFlag = languageImgFlag
        this.languageAvailableSpanish = languageAvailableSpa
        this.languageAvailableEnglish = languageAvailableEng
    }

}