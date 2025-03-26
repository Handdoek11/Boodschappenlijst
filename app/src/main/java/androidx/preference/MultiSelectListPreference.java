package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: l0, reason: collision with root package name */
    private CharSequence[] f10381l0;

    /* renamed from: m0, reason: collision with root package name */
    private CharSequence[] f10382m0;

    /* renamed from: n0, reason: collision with root package name */
    private Set f10383n0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f10383n0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10585E, i8, i9);
        this.f10381l0 = p0.k.q(obtainStyledAttributes, t.f10591H, t.f10587F);
        this.f10382m0 = p0.k.q(obtainStyledAttributes, t.f10593I, t.f10589G);
        obtainStyledAttributes.recycle();
    }

    public CharSequence[] Q0() {
        return this.f10381l0;
    }

    public CharSequence[] R0() {
        return this.f10382m0;
    }

    public Set S0() {
        return this.f10383n0;
    }

    public void T0(Set set) {
        this.f10383n0.clear();
        this.f10383n0.addAll(set);
        l0(set);
        P();
    }

    @Override // androidx.preference.Preference
    protected Object Z(TypedArray typedArray, int i8) {
        CharSequence[] textArray = typedArray.getTextArray(i8);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected void c0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.c0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.c0(aVar.getSuperState());
        T0(aVar.f10384o);
    }

    @Override // androidx.preference.Preference
    protected Parcelable d0() {
        Parcelable d02 = super.d0();
        if (M()) {
            return d02;
        }
        a aVar = new a(d02);
        aVar.f10384o = S0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void e0(Object obj) {
        T0(B((Set) obj));
    }

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0175a();

        /* renamed from: o, reason: collision with root package name */
        Set f10384o;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a, reason: collision with other inner class name */
        class C0175a implements Parcelable.Creator {
            C0175a() {
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
            int readInt = parcel.readInt();
            this.f10384o = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f10384o, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f10384o.size());
            Set set = this.f10384o;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p0.k.a(context, n.f10549b, R.attr.dialogPreferenceStyle));
    }
}
