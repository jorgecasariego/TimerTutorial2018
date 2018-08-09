package me.jorgecasariego.timertutorial2018

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat

class SettingsActivityFragment: PreferenceFragmentCompat() {
    override fun onCreatePreferences(bundle: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }
}