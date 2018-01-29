package com.example.macintosh.androidtestproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.macintosh.androidtestproject.R
import com.example.macintosh.androidtestproject.model.LanguageToLearnEntity

/**
 * Created by macintosh on 1/28/18.
 */
public class LanguagesCoursesAdapter : BaseAdapter {

    var innerContext: Context?
    var innerData : ArrayList<LanguageToLearnEntity>

    constructor(context: Context, data: ArrayList<LanguageToLearnEntity>) : super() {
        print("context: " + context.toString() +  "innerdata: " + data.toString())

        this.innerContext = context
        this.innerData = data
    }

    override fun getView(position: Int, convertView: View, parentViewGroup: ViewGroup): View {

        var currentView : View

        if (convertView == null){
            currentView = LayoutInflater.from(this.innerContext).inflate(R.layout.language_course, parentViewGroup,false)
        }
        else{
            currentView = convertView
        }


        //var view = LayoutInflater.from(this.innerContext).inflate(R.layout.language_course, parentViewGroup,false)
        // view = convertView ?: LayoutInflater.from(this.innerContext).inflate(R.layout.language_course, parentViewGroup,false)

        var langCourses : LanguageToLearnEntity = getItem(position) as LanguageToLearnEntity;

        var tviLanguageNameSpa = currentView.findViewById<TextView>(R.id.tviLanguageNameSpa)
        var tviLanguageNameEng = currentView.findViewById<TextView>(R.id.tviLanguageNameEng)

        tviLanguageNameSpa.setText(langCourses.languageNameSpa)
        tviLanguageNameEng.setText(langCourses.languageNameEng)

        return currentView

    }

    override fun getItem(position: Int): Any {
        return innerData.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return innerData.count()
    }


}