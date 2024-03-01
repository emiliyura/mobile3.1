package com.example.mobile3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //получение и управление в коде
        TextView textView = findViewById(R.id.textView3);
        textView.setText("new text");

        // создание нового текста
        TextView mText = new TextView(this);
        mText.setText("javaavavavavavavavavavavavaavavavavvavavavava");

        setContentView(mText);


        //определение размеров
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenWidth = displayMetrics.widthPixels;
        int screenHeight = displayMetrics.heightPixels;

        //програмная установка размеров
        mText.setWidth(screenWidth / 2);
        mText.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

        // Программная установка отступов

        //Установка отступов
        mText.setPadding(200, 10, 20, 10);

        //Получаем параметры макета, чтобы иметь возможность установить внешние отступы.
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) mText.getLayoutParams();

        // Устанавливаем внешние отступы
        params.setMargins(10, 5, 10, 5);

        // После установки параметров макета, необходимо вызвать requestLayout(),
        // чтобы применить изменения и перерасчитать расположение элемента в интерфейсе.
        mText.setLayoutParams(params);



        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        constraintLayout.setLayoutParams(new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));


        // Добавляем кнопки и задаем их параметры макета

// Создаем новую кнопку button1 и устанавливаем ей уникальный идентификатор
        Button button1 = new Button(this);
        button1.setId(View.generateViewId());
        button1.setText("Button 1");

// Создаем новую кнопку button2 и устанавливаем ей уникальный идентификатор
        Button button2 = new Button(this);
        button2.setId(View.generateViewId());
        button2.setText("Button 2");

// Устанавливаем параметры макета для кнопки 1

// Создаем объект LayoutParams, который будет использоваться для установки параметров макета кнопки 1
        ConstraintLayout.LayoutParams paramsButton1 = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);

// Устанавливаем, что левая сторона кнопки (start) будет прикреплена к левой стороне родительского элемента
        paramsButton1.startToStart = ConstraintLayout.LayoutParams.PARENT_ID;

// Устанавливаем, что верхняя сторона кнопки (top) будет прикреплена к верхней стороне родительского элемента
        paramsButton1.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

// Устанавливаем параметры макета для кнопки 1
        button1.setLayoutParams(paramsButton1);

// Устанавливаем параметры макета для кнопки 2

// Создаем объект LayoutParams для установки параметров макета кнопки 2
        ConstraintLayout.LayoutParams paramsButton2 = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);

// Устанавливаем, что левая сторона кнопки 2 (start) будет прикреплена к правой стороне кнопки 1
        paramsButton2.startToEnd = button1.getId();

// Устанавливаем, что верхняя сторона кнопки 2 (top) будет прикреплена к верхней стороне родительского элемента
        paramsButton2.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

// Устанавливаем параметры макета для кнопки 2
        button2.setLayoutParams(paramsButton2);

// Добавляем кнопки в ConstraintLayout
        constraintLayout.addView(button1);
        constraintLayout.addView(button2);

// Устанавливаем constraintLayout в корневой контейнер активити
        setContentView(constraintLayout);

    }
}