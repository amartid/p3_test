package com.poupa.vinylmusicplayer.ui.fragments.mainactivity.library.pager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.loader.app.LoaderManager;

import com.poupa.vinylmusicplayer.ui.fragments.AbsMusicServiceFragment;
import com.poupa.vinylmusicplayer.ui.fragments.mainactivity.library.LibraryFragment;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
public class AbsLibraryPagerFragment extends AbsMusicServiceFragment {

    /* http://stackoverflow.com/a/2888433 */
    @Override
    @NonNull
    public LoaderManager getLoaderManager() {
        return getParentFragment().getLoaderManager();
    }

    public LibraryFragment getLibraryFragment() {
        return (LibraryFragment) getParentFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
}
