package com.rana.myapplication_epoxy

import com.airbnb.epoxy.TypedEpoxyController

class EntryController : TypedEpoxyController<List<Entry>>() {
    override fun buildModels(data: List<Entry>) {
        data.forEach{
            entryComponent {
                id(it.id)
                entry(it)
            }
        }
    }

}