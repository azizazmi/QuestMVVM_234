package com.example.prak6_mvvm.view

import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.prak6_mvvm.R
import com.example.prak6_mvvm.model.Siswa

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

}