package com.example.prak6_mvvm.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.prak6_mvvm.R
import com.example.prak6_mvvm.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa (
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit
) {
    val items = listOf(
        Pair(stringResource(R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(R.string.gender), statusUiSiswa.gender),
        Pair(stringResource(R.string.alamat), statusUiSiswa.alamat)
    )

    Scaffold(
        modifier = Modifier,
        {
            TopAppBar(
                title = {
                    Text(
                        stringResource(R.string.detail),
                        color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(R.color.purple_500))
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

        }
    }
}