package com.bingjunior.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.bingjunior.gallery.R
import com.bingjunior.gallery.Photo
import kotlinx.android.synthetic.main.activity_photos.photosRecyclerView

class PhotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photos)
        val photosViewModel: PhotosViewModel by viewModels()

        photosRecyclerView.adapter = photosViewModel.photosAdapter
        photosRecyclerView.layoutManager = GridLayoutManager(this, 3)
        photosViewModel.loadPhotos().observe(this,
            Observer<List<Photo>> { list ->
                with(photosViewModel.photosAdapter) {
                    photos.clear()
                    photos.addAll(list)
                    notifyDataSetChanged()
                }
            })
    }
}

