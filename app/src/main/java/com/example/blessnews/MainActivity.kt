package com.example.blessnews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<ItemOfList>(
            ItemOfList(
                R.drawable.image1,
                "Влад расстался?",
            "Сюда хочу вставить прикольную гифку и это будет кликбайтом мафака," +
                    "На самом деле да, поэтому и делаю практическую"
            ),
            ItemOfList(
                R.drawable.image2,
                "Ученые расшифровали геном вируса герпеса",
            " Немецкие и британские биологи расшифровали геном вируса простого герпеса, который оказался намного сложнее, чем считалось ранее."+
                    "Вирус простого герпеса типа 1 (ВПГ-1) — едва ли не самый распространенный среди людей вирус."+
                    "По разным данным, вирусом ВПГ-1 заражены от 60 до 95 процентов всего взрослого населения мира."+
                    "При попадании в организм человека вирус простого герпеса сохраняется там на всю оставшуюся жизнь."+
                    "Он может никак не заявлять о себе в течение длительного времени, становясь активным только при особых обстоятельствах,"+
                    "таких как ослабление иммунной системы, переохлаждение, нервный стресс и некоторых других..."
            ),
            ItemOfList(
                R.drawable.image3,
                "Запрет на массовую рассылку в WhatsApp сработал — число «вирусных» сообщений снизилось на 70%",
            "В WhatsApp заявили, что ограничение на массовые рассылки снизило число «вирусных» сообщений на 70% менее чем за месяц. Эту меру приняли в целях борьбы с распространением дезинформации о коронавирусе."+
                    "Пользователи мессенджера теперь могут отправлять часто пересылаемые сообщения только одному человеку или группе. Ранее пересылка ограничивалась пятью адресатами. Ограничение затронуло всех пользователей WhatsApp, около 2 млрд человек."+
                    "«Это изменение помогает сохранять WhatsApp как место для личных бесед. WhatsApp стремится внести свой вклад в борьбу с вирусными сообщениями», — отметил представитель мессенджера."+
                    "Впервые подобное ограничение на пересылку сообщений WhatsApp ввел в 2018 году. Когда же мессенджер ранее в апреле объявил о новом лимите, то уточнил, что в предыдущий раз мера позволила ограничить количество пересылаемых сообщений на 25% во всем мире."
            ),
            ItemOfList(
                R.drawable.image4,
                "Создан сайт, который самоуничтожится, если пользователи не будут публиковать там сообщения в течение суток",
            "Программистка и веб-дизайнер из Канады (aka FemmeAndroid) создала сайт с названием This Website Will Self-Destruct, который должен самоуничтожиться, если пользователи в течение 24 часов (86 400 секунд) не опубликуют на нем ни одного сообщения. После активации режима уничтожения все сообщения пользователей, которые они ранее оставили на сайте, чтобы поддержать его в работе, будут также стерты. Ожидается, что при заходе на его адрес после этого события будет выдаваться сообщение об ошибке."+
                    "В настоящее время этот сайт работает уже больше недели с 18 апреля 2020 года."+
                    "Сайт имеет простую веб-форму, которая позволяет пользователю отправить любое текстовое сообщение, чтобы таймер наверху экрана снова стал равен 86 400 секунд. Также на сайте размещена информация, что все присланные пользователями сообщения хранятся анонимно. Размер сообщения не ограничен, а некоторые пользователи даже вставляют в них ссылки и делают форматирование текста перед публикацией."+
                    "«Я не собираю никаких данных о вас, кроме текста, который вы мне отправляете. Я не верю в отслеживание людей, поэтому аналитика о пользователях тут не ведется. Считайте, что это моя политика конфиденциальности и условия обслуживания», — кратко написано на сайте."
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ItemAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("OBJECT_INTENT", it)
            startActivity(intent)
        }
    }
}
