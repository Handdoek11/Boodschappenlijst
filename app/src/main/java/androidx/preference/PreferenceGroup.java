package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q.C6407k;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: f0, reason: collision with root package name */
    final C6407k f10427f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Handler f10428g0;

    /* renamed from: h0, reason: collision with root package name */
    private final List f10429h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f10430i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f10431j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f10432k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f10433l0;

    /* renamed from: m0, reason: collision with root package name */
    private final Runnable f10434m0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f10427f0.clear();
            }
        }
    }

    public interface b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f10427f0 = new C6407k();
        this.f10428g0 = new Handler(Looper.getMainLooper());
        this.f10430i0 = true;
        this.f10431j0 = 0;
        this.f10432k0 = false;
        this.f10433l0 = Integer.MAX_VALUE;
        this.f10434m0 = new a();
        this.f10429h0 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10578A0, i8, i9);
        int i10 = t.f10582C0;
        this.f10430i0 = p0.k.b(obtainStyledAttributes, i10, i10, true);
        if (obtainStyledAttributes.hasValue(t.f10580B0)) {
            int i11 = t.f10580B0;
            T0(p0.k.d(obtainStyledAttributes, i11, i11, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public void K0(Preference preference) {
        L0(preference);
    }

    public boolean L0(Preference preference) {
        long f8;
        if (this.f10429h0.contains(preference)) {
            return true;
        }
        if (preference.u() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.x() != null) {
                preferenceGroup = preferenceGroup.x();
            }
            String u7 = preference.u();
            if (preferenceGroup.M0(u7) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + u7 + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.w() == Integer.MAX_VALUE) {
            if (this.f10430i0) {
                int i8 = this.f10431j0;
                this.f10431j0 = i8 + 1;
                preference.y0(i8);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).U0(this.f10430i0);
            }
        }
        int binarySearch = Collections.binarySearch(this.f10429h0, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!S0(preference)) {
            return false;
        }
        synchronized (this) {
            this.f10429h0.add(binarySearch, preference);
        }
        k D7 = D();
        String u8 = preference.u();
        if (u8 == null || !this.f10427f0.containsKey(u8)) {
            f8 = D7.f();
        } else {
            f8 = ((Long) this.f10427f0.get(u8)).longValue();
            this.f10427f0.remove(u8);
        }
        preference.U(D7, f8);
        preference.a(this);
        if (this.f10432k0) {
            preference.S();
        }
        R();
        return true;
    }

    public Preference M0(CharSequence charSequence) {
        Preference M02;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(u(), charSequence)) {
            return this;
        }
        int Q02 = Q0();
        for (int i8 = 0; i8 < Q02; i8++) {
            Preference P02 = P0(i8);
            if (TextUtils.equals(P02.u(), charSequence)) {
                return P02;
            }
            if ((P02 instanceof PreferenceGroup) && (M02 = ((PreferenceGroup) P02).M0(charSequence)) != null) {
                return M02;
            }
        }
        return null;
    }

    public int N0() {
        return this.f10433l0;
    }

    public b O0() {
        return null;
    }

    public Preference P0(int i8) {
        return (Preference) this.f10429h0.get(i8);
    }

    @Override // androidx.preference.Preference
    public void Q(boolean z7) {
        super.Q(z7);
        int Q02 = Q0();
        for (int i8 = 0; i8 < Q02; i8++) {
            P0(i8).b0(this, z7);
        }
    }

    public int Q0() {
        return this.f10429h0.size();
    }

    protected boolean R0() {
        return true;
    }

    @Override // androidx.preference.Preference
    public void S() {
        super.S();
        this.f10432k0 = true;
        int Q02 = Q0();
        for (int i8 = 0; i8 < Q02; i8++) {
            P0(i8).S();
        }
    }

    protected boolean S0(Preference preference) {
        preference.b0(this, F0());
        return true;
    }

    public void T0(int i8) {
        if (i8 != Integer.MAX_VALUE && !J()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f10433l0 = i8;
    }

    public void U0(boolean z7) {
        this.f10430i0 = z7;
    }

    void V0() {
        synchronized (this) {
            Collections.sort(this.f10429h0);
        }
    }

    @Override // androidx.preference.Preference
    public void Y() {
        super.Y();
        this.f10432k0 = false;
        int Q02 = Q0();
        for (int i8 = 0; i8 < Q02; i8++) {
            P0(i8).Y();
        }
    }

    @Override // androidx.preference.Preference
    protected void c0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(c.class)) {
            super.c0(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        this.f10433l0 = cVar.f10436o;
        super.c0(cVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    protected Parcelable d0() {
        return new c(super.d0(), this.f10433l0);
    }

    @Override // androidx.preference.Preference
    protected void h(Bundle bundle) {
        super.h(bundle);
        int Q02 = Q0();
        for (int i8 = 0; i8 < Q02; i8++) {
            P0(i8).h(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void i(Bundle bundle) {
        super.i(bundle);
        int Q02 = Q0();
        for (int i8 = 0; i8 < Q02; i8++) {
            P0(i8).i(bundle);
        }
    }

    static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f10436o;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i8) {
                return new c[i8];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.f10436o = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f10436o);
        }

        c(Parcelable parcelable, int i8) {
            super(parcelable);
            this.f10436o = i8;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
