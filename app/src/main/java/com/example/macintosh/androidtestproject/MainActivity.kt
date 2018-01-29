package com.example.macintosh.androidtestproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.macintosh.androidtestproject.storage.LanguageToLearn
import com.example.macintosh.androidtestproject.adapter.*
import com.example.macintosh.androidtestproject.model.LanguageToLearnEntity
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.DatabaseMetaData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Identificar al ListView
        var lviLangCourses = findViewById<ListView>(R.id.lviLangCourses)

        //Traer la innerData
        var languagesCoursesData = LanguageToLearn().languagesToLearnEntityList

        //Establecer Contexto y Data para el Adapter
        //var languagesObjAdapter = LanguagesCoursesAdapter(this, languagesCoursesData)
        var languagesObjAdapter = LangCourseAdapter(this, languagesCoursesData)

        //Linkear el Adapter al Content (ListView en este caso)
        lviLangCourses.setAdapter(languagesObjAdapter)

        //Establecer el comportamiento al hacer click en uno de los elementos del ListView

        /*
        fun <LanguagesCoursesAdapter> AdapterView<Adapter>
                .setOnItemClickListener(function: (parent: AdapterView<Adapter>?, view: View?, position:Int, id:Int) -> Unit)
        {
            //var langCourseEntity= parent.adapter.getItem(position) as LanguageToLearnEntity

        }*/


        lviLangCourses.setOnItemClickListener {adapterView, view, position, l ->
            var langCourseEntity= adapterView.adapter.getItem(position) as LanguageToLearnEntity;
            var courseInfo = langCourseEntity.languageNameSpa
            showMessage(courseInfo)
        }



    }


        /*
        lviLangCourses.setOnItemClickListener{
            (parent: AdapterView<*>?, view: View?, position:Int, id:Int) ->
            var langCourseEntity= parent!!.adapter.getItem(position) as LanguageToLearnEntity;
            var courseInfo = langCourseEntity.languageNameSpa + " " + langCourseEntity.languageAvailableSpanish
        }
        */


    fun showMessage(value:String){
        Toast.makeText(this, "item "+value, Toast.LENGTH_SHORT).show();
    }

        //fun <T> AdapterView<T>.setOnItemClickListener(function: (AdapterView<Adapter>?, View?, Int, Int) -> Unit) {}

}


