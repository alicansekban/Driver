package com.generalmobile.app.driverexample.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH$J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017\u00a8\u0006\u0019"}, d2 = {"Lcom/generalmobile/app/driverexample/core/BasePagedListAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/generalmobile/app/driverexample/core/BaseEntity;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "bind", "", "binding", "Landroidx/databinding/ViewDataBinding;", "position", "", "createBinding", "parent", "Landroid/view/ViewGroup;", "viewType", "getViewHolder", "onBindViewHolder", "holder", "onCreateViewHolder", "setList", "list", "Landroidx/paging/PagedList;", "Companion", "app_debug"})
public abstract class BasePagedListAdapter extends androidx.paging.PagedListAdapter<com.generalmobile.app.driverexample.core.BaseEntity, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    public static final com.generalmobile.app.driverexample.core.BasePagedListAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.databinding.ViewDataBinding createBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType);
    
    protected abstract void bind(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding binding, int position);
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    androidx.paging.PagedList<?> list) {
    }
    
    public BasePagedListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<com.generalmobile.app.driverexample.core.BaseEntity> diffCallback) {
        super(null);
    }
    
    public BasePagedListAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/generalmobile/app/driverexample/core/BasePagedListAdapter$Companion;", "", "()V", "BaseDiffCallback", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * * This diff callback informs the PagedListAdapter how to compute list differences when new
         *         * PagedLists arrive.
         *         * <p>
         *         * When you add a Cheese with the 'Add' button, the PagedListAdapter uses diffCallback to
         *         * detect there's only a single item difference from before, so it only needs to animate and
         *         * rebind a single view.
         *         *
         *         * @see android.support.v7.util.DiffUtil
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/generalmobile/app/driverexample/core/BasePagedListAdapter$Companion$BaseDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/generalmobile/app/driverexample/core/BaseEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
        public static class BaseDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.generalmobile.app.driverexample.core.BaseEntity> {
            
            @java.lang.Override()
            public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
            com.generalmobile.app.driverexample.core.BaseEntity oldItem, @org.jetbrains.annotations.NotNull()
            com.generalmobile.app.driverexample.core.BaseEntity newItem) {
                return false;
            }
            
            /**
             * * Note that in kotlin, == checking on data classes compares all contents, but in Java,
             *             * typically you'll implement Object#equals, and use it to compare object contents.
             */
            @java.lang.Override()
            public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
            com.generalmobile.app.driverexample.core.BaseEntity oldItem, @org.jetbrains.annotations.NotNull()
            com.generalmobile.app.driverexample.core.BaseEntity newItem) {
                return false;
            }
            
            public BaseDiffCallback() {
                super();
            }
        }
    }
}