package com.escodro.category.presentation.bottomsheet

import com.escodro.categoryapi.model.Category

internal sealed class CategorySheetState {

    object Empty : CategorySheetState()

    data class Loaded(val category: Category) : CategorySheetState()
}
