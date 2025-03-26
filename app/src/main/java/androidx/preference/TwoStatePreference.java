package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: f0, reason: collision with root package name */
    protected boolean f10463f0;

    /* renamed from: g0, reason: collision with root package name */
    private CharSequence f10464g0;

    /* renamed from: h0, reason: collision with root package name */
    private CharSequence f10465h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f10466i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f10467j0;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }

    @Override // androidx.preference.Preference
    public boolean F0() {
        return (this.f10467j0 ? this.f10463f0 : !this.f10463f0) || super.F0();
    }

    public boolean K0() {
        return this.f10463f0;
    }

    public void L0(boolean z7) {
        boolean z8 = this.f10463f0 != z7;
        if (z8 || !this.f10466i0) {
            this.f10463f0 = z7;
            this.f10466i0 = true;
            i0(z7);
            if (z8) {
                Q(F0());
                P();
            }
        }
    }

    public void M0(boolean z7) {
        this.f10467j0 = z7;
    }

    public void N0(CharSequence charSequence) {
        this.f10465h0 = charSequence;
        if (K0()) {
            return;
        }
        P();
    }

    public void O0(CharSequence charSequence) {
        this.f10464g0 = charSequence;
        if (K0()) {
            P();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void P0(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f10463f0
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f10464g0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f10464g0
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f10463f0
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f10465h0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f10465h0
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.F()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.P0(android.view.View):void");
    }

    protected void Q0(m mVar) {
        P0(mVar.g0(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void W() {
        super.W();
        boolean z7 = !K0();
        if (c(Boolean.valueOf(z7))) {
            L0(z7);
        }
    }

    @Override // androidx.preference.Preference
    protected Object Z(TypedArray typedArray, int i8) {
        return Boolean.valueOf(typedArray.getBoolean(i8, false));
    }

    @Override // androidx.preference.Preference
    protected void c0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.c0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.c0(aVar.getSuperState());
        L0(aVar.f10468o);
    }

    @Override // androidx.preference.Preference
    protected Parcelable d0() {
        Parcelable d02 = super.d0();
        if (M()) {
            return d02;
        }
        a aVar = new a(d02);
        aVar.f10468o = K0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void e0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        L0(y(((Boolean) obj).booleanValue()));
    }

    static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0176a();

        /* renamed from: o, reason: collision with root package name */
        boolean f10468o;

        /* renamed from: androidx.preference.TwoStatePreference$a$a, reason: collision with other inner class name */
        class C0176a implements Parcelable.Creator {
            C0176a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i8) {
                return new a[i8];
            }
        }

        a(Parcel parcel) {
            super(parcel);
            this.f10468o = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f10468o ? 1 : 0);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
