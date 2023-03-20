package com.example.courtcounterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var scoreA: Int = 0
    private var scoreB: Int = 0

    private var teamAthree: Button? = null
    private var teamBthree: Button? = null
    private var textViewScoreA: TextView? = null
    private var textViewScoreB: TextView? = null
    private var teamAtwo: Button? = null
    private var teamBtwo: Button? = null
    private var teamAfreeThrow: Button? = null
    private var teamBfreeThrow: Button? = null
    private var resetBtn: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        setupListener()


    }

    fun initView() {
        teamAthree = findViewById(R.id.left_three_points)
        teamBthree = findViewById(R.id.right_three_points)

        textViewScoreA = findViewById(R.id.score_one)
        textViewScoreB = findViewById(R.id.score_tow)

        teamAtwo = findViewById(R.id.left_two_points)
        teamBtwo = findViewById(R.id.right_two_points)

        teamAfreeThrow = findViewById(R.id.left_free_throw)
        teamBfreeThrow = findViewById(R.id.right_free_throw)

        resetBtn = findViewById(R.id.reset_button)
    }

    private fun setupListener(){
        teamAthree?.setOnClickListener {
            scoreA += 3
            setTextScoreA()
        }
        teamBthree?.setOnClickListener {
            scoreB += 3
            setTextScoreB()
        }
        teamAtwo?.setOnClickListener {
            scoreA += 2
            setTextScoreA()
        }
        teamBtwo?.setOnClickListener {
            scoreB += 2
            setTextScoreB()
        }
        teamAfreeThrow?.setOnClickListener {
            scoreA += 1
            setTextScoreA()
        }
        teamBfreeThrow?.setOnClickListener {
            scoreB += 1
            setTextScoreB()
        }
        resetBtn?.setOnClickListener {
            scoreA = 0
            scoreB = 0
            setTextScoreA()
            setTextScoreB()
        }
    }

    private fun setTextScoreA(){
        textViewScoreA?.text = scoreA.toString()
    }
    private fun setTextScoreB(){
        textViewScoreB?.text = scoreB.toString()
    }
}