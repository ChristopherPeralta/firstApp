package com.chris.myapplication.Settings

import android.os.CombinedVibration

data class SettingsModel(
    var volume: Int,
    var bluetooth: Boolean,
    var vibration: Boolean,
    var darkMode: Boolean,
)