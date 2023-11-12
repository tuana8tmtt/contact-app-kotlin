package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactapp.adapter.ContactAdapter
import com.example.contactapp.databinding.ActivityMainBinding
import com.example.contactapp.model.Contact

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactList = listOf(
            Contact("Josefina Lehner", "555-555-5555", "josefina@gmail.com", 1),
            Contact("Stuart Vandervort", "123-456-7890", "stuart@example.com", 2),
            Contact("Maddison Russel", "987-654-3210", "maddison@example.com", 3),
            Contact("Halie Morar", "111-222-3333", "halie@example.com", 4),
            Contact("Karelle Simonis", "999-888-7777", "karelle@example.com", 5),
            Contact("Hannal Welch", "444-333-2222", "hannal@example.com", 6),
            Contact("Fanny Frami", "777-666-5555", "fanny@example.com", 7),
            Contact("Elfrieda Wisozk", "333-444-5555", "elfrieda@example.com", 8),
            Contact("Donald Trump", "666-555-4444", "donald@example.com", 9),
            Contact("Kim Jong un", "222-333-4444", "kim@example.com", 10)
        )

        binding.recyclerView.adapter = ContactAdapter(contactList)
        binding.recyclerView.setHasFixedSize(true)
    }
}