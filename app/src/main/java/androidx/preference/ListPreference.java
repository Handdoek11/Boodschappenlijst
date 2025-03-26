package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: l0, reason: collision with root package name */
    private CharSequence[] f10374l0;

    /* renamed from: m0, reason: collision with root package name */
    private CharSequence[] f10375m0;

    /* renamed from: n0, reason: collision with root package name */
    private String f10376n0;

    /* renamed from: o0, reason: collision with root package name */
    private String f10377o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f10378p0;

    public static final class b implements Preference.f {

        /* renamed from: a, reason: collision with root package name */
        private static b f10380a;

        private b() {
        }

        public static b b() {
            if (f10380a == null) {
                f10380a = new b();
            }
            return f10380a;
        }

        @Override // androidx.preference.Preference.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.S0()) ? listPreference.m().getString(r.f10573c) : listPreference.S0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10687y, i8, i9);
        this.f10374l0 = p0.k.q(obtainStyledAttributes, t.f10579B, t.f10689z);
        this.f10375m0 = p0.k.q(obtainStyledAttributes, t.f10581C, t.f10577A);
        int i10 = t.f10583D;
        if (p0.k.b(obtainStyledAttributes, i10, i10, false)) {
            B0(b.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t.f10595J, i8, i9);
        this.f10377o0 = p0.k.o(obtainStyledAttributes2, t.f10674r0, t.f10611R);
        obtainStyledAttributes2.recycle();
    }

    private int V0() {
        return Q0(this.f10376n0);
    }

    @Override // androidx.preference.Preference
    public void A0(CharSequence charSequence) {
        super.A0(charSequence);
        if (charSequence == null) {
            this.f10377o0 = null;
        } else {
            this.f10377o0 = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence F() {
        if (G() != null) {
            return G().a(this);
        }
        CharSequence S02 = S0();
        CharSequence F7 = super.F();
        String str = this.f10377o0;
        if (str == null) {
            return F7;
        }
        if (S02 == null) {
            S02 = "";
        }
        String format = String.format(str, S02);
        if (TextUtils.equals(format, F7)) {
            return F7;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public int Q0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f10375m0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f10375m0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] R0() {
        return this.f10374l0;
    }

    public CharSequence S0() {
        CharSequence[] charSequenceArr;
        int V02 = V0();
        if (V02 < 0 || (charSequenceArr = this.f10374l0) == null) {
            return null;
        }
        return charSequenceArr[V02];
    }

    public CharSequence[] T0() {
        return this.f10375m0;
    }

    public String U0() {
        return this.f10376n0;
    }

    public void W0(CharSequence[] charSequenceArr) {
        this.f10374l0 = charSequenceArr;
    }

    public void X0(CharSequence[] charSequenceArr) {
        this.f10375m0 = charSequenceArr;
    }

    public void Y0(String str) {
        boolean equals = TextUtils.equals(this.f10376n0, str);
        if (equals && this.f10378p0) {
            return;
        }
        this.f10376n0 = str;
        this.f10378p0 = true;
        k0(str);
        if (equals) {
            return;
        }
        P();
    }

    @Override // androidx.preference.Preference
    protected Object Z(TypedArray typedArray, int i8) {
        return typedArray.getString(i8);
    }

    @Override // androidx.preference.Preference
    protected void c0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.c0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.c0(aVar.getSuperState());
        Y0(aVar.f10379o);
    }

    @Override // androidx.preference.Preference
    protected Parcelable d0() {
        Parcelable d02 = super.d0();
        if (M()) {
            return d02;
        }
        a aVar = new a(d02);
        aVar.f10379o = U0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void e0(Object obj) {
        Y0(A((String) obj));
    }

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0174a();

        /* renamed from: o, reason: collision with root package name */
        String f10379o;

        /* renamed from: androidx.preference.ListPreference$a$a, reason: collision with other inner class name */
        class C0174a implements Parcelable.Creator {
            C0174a() {
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
            this.f10379o = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeString(this.f10379o);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p0.k.a(context, n.f10549b, R.attr.dialogPreferenceStyle));
    }
}
