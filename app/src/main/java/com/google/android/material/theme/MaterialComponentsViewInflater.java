package com.google.android.material.theme;

import R3.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.z;
import androidx.appcompat.widget.C0844d;
import androidx.appcompat.widget.C0846f;
import androidx.appcompat.widget.C0847g;
import androidx.appcompat.widget.C0861v;
import androidx.appcompat.widget.D;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.w;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends z {
    @Override // androidx.appcompat.app.z
    protected C0844d c(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // androidx.appcompat.app.z
    protected C0846f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.z
    protected C0847g e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.z
    protected C0861v k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.z
    protected D o(Context context, AttributeSet attributeSet) {
        return new Y3.a(context, attributeSet);
    }
}
