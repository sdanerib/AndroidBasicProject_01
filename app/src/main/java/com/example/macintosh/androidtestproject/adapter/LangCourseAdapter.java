package com.example.macintosh.androidtestproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.macintosh.androidtestproject.R;
import com.example.macintosh.androidtestproject.model.LanguageToLearnEntity;

import java.util.List;

/**
 * Created by macintosh on 1/29/18.
 */

public class LangCourseAdapter extends BaseAdapter {

    private Context context;
    private List<LanguageToLearnEntity> data;

    public LangCourseAdapter(Context context, List<LanguageToLearnEntity> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View currentView;

        if (view == null) {
            currentView = LayoutInflater.from(this.context).inflate(R.layout.language_course, viewGroup,false);
        } else {
            currentView = view;
        }

        LanguageToLearnEntity langCourses = (LanguageToLearnEntity) getItem(position);

        TextView tviLanguageNameSpa = currentView.findViewById(R.id.tviLanguageNameSpa);
        TextView tviLanguageNameEng = currentView.findViewById(R.id.tviLanguageNameEng);

        tviLanguageNameSpa.setText(langCourses.getLanguageNameSpa());
        tviLanguageNameEng.setText(langCourses.getLanguageNameEng());

        return currentView;
    }
}
