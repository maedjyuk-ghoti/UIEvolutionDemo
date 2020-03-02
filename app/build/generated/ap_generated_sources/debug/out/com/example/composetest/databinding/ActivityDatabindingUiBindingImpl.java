package com.example.composetest.databinding;
import com.example.composetest.R;
import com.example.composetest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDatabindingUiBindingImpl extends ActivityDatabindingUiBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mMyClickListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityDatabindingUiBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ActivityDatabindingUiBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.myButton.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.myClickListener == variableId) {
            setMyClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.buttonText == variableId) {
            setButtonText((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyClickListener(@Nullable android.view.View.OnClickListener MyClickListener) {
        this.mMyClickListener = MyClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.myClickListener);
        super.requestRebind();
    }
    public void setButtonText(@Nullable java.lang.String ButtonText) {
        this.mButtonText = ButtonText;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.buttonText);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.view.View.OnClickListener myClickListenerOnClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener myClickListener = mMyClickListener;
        java.lang.String buttonText = mButtonText;

        if ((dirtyFlags & 0x5L) != 0) {



                if (myClickListener != null) {
                    // read myClickListener::onClick
                    myClickListenerOnClickAndroidViewViewOnClickListener = (((mMyClickListenerOnClickAndroidViewViewOnClickListener == null) ? (mMyClickListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mMyClickListenerOnClickAndroidViewViewOnClickListener).setValue(myClickListener));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.myButton, buttonText);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.myButton.setOnClickListener(myClickListenerOnClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private android.view.View.OnClickListener value;
        public OnClickListenerImpl setValue(android.view.View.OnClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): myClickListener
        flag 1 (0x2L): buttonText
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}