package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: l0, reason: collision with root package name */
    private String f10371l0;

    public interface a {
    }

    public static final class c implements Preference.f {

        /* renamed from: a, reason: collision with root package name */
        private static c f10373a;

        private c() {
        }

        public static c b() {
            if (f10373a == null) {
                f10373a = new c();
            }
            return f10373a;
        }

        @Override // androidx.preference.Preference.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.R0()) ? editTextPreference.m().getString(r.f10573c) : editTextPreference.R0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10683w, i8, i9);
        int i10 = t.f10685x;
        if (p0.k.b(obtainStyledAttributes, i10, i10, false)) {
            B0(c.b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean F0() {
        return TextUtils.isEmpty(this.f10371l0) || super.F0();
    }

    a Q0() {
        return null;
    }

    public String R0() {
        return this.f10371l0;
    }

    public void S0(String str) {
        boolean F02 = F0();
        this.f10371l0 = str;
        k0(str);
        boolean F03 = F0();
        if (F03 != F02) {
            Q(F03);
        }
        P();
    }

    @Override // androidx.preference.Preference
    protected Object Z(TypedArray typedArray, int i8) {
        return typedArray.getString(i8);
    }

    @Override // androidx.preference.Preference
    protected void c0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(b.class)) {
            super.c0(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.c0(bVar.getSuperState());
        S0(bVar.f10372o);
    }

    @Override // androidx.preference.Preference
    protected Parcelable d0() {
        Parcelable d02 = super.d0();
        if (M()) {
            return d02;
        }
        b bVar = new b(d02);
        bVar.f10372o = R0();
        return bVar;
    }

    @Override // androidx.preference.Preference
    protected void e0(Object obj) {
        S0(A((String) obj));
    }

    private static class b extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        String f10372o;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i8) {
                return new b[i8];
            }
        }

        b(Parcel parcel) {
            super(parcel);
            this.f10372o = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeString(this.f10372o);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p0.k.a(context, n.f10551d, R.attr.editTextPreferenceStyle));
    }
}
