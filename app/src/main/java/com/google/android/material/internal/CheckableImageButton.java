package com.google.android.material.internal;

import A0.z;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C0856p;
import f.AbstractC5752a;
import z0.C7013a;
import z0.X;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C0856p implements Checkable {

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f32008x = {R.attr.state_checked};

    /* renamed from: u, reason: collision with root package name */
    private boolean f32009u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f32010v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f32011w;

    class a extends C7013a {
        a() {
        }

        @Override // z0.C7013a
        public void j(View view, AccessibilityEvent accessibilityEvent) {
            super.j(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // z0.C7013a
        public void k(View view, z zVar) {
            super.k(view, zVar);
            zVar.i0(CheckableImageButton.this.a());
            zVar.j0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends F0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        boolean f32013t;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f32013t = parcel.readInt() == 1;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f32013t ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35399z);
    }

    public boolean a() {
        return this.f32010v;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f32009u;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i8) {
        if (!this.f32009u) {
            return super.onCreateDrawableState(i8);
        }
        int[] iArr = f32008x;
        return View.mergeDrawableStates(super.onCreateDrawableState(i8 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f32013t);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f32013t = this.f32009u;
        return bVar;
    }

    public void setCheckable(boolean z7) {
        if (this.f32010v != z7) {
            this.f32010v = z7;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        if (!this.f32010v || this.f32009u == z7) {
            return;
        }
        this.f32009u = z7;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z7) {
        this.f32011w = z7;
    }

    @Override // android.view.View
    public void setPressed(boolean z7) {
        if (this.f32011w) {
            super.setPressed(z7);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f32009u);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f32010v = true;
        this.f32011w = true;
        X.n0(this, new a());
    }
}
