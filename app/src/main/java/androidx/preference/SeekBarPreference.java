package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: f0, reason: collision with root package name */
    int f10438f0;

    /* renamed from: g0, reason: collision with root package name */
    int f10439g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f10440h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f10441i0;

    /* renamed from: j0, reason: collision with root package name */
    boolean f10442j0;

    /* renamed from: k0, reason: collision with root package name */
    SeekBar f10443k0;

    /* renamed from: l0, reason: collision with root package name */
    private TextView f10444l0;

    /* renamed from: m0, reason: collision with root package name */
    boolean f10445m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f10446n0;

    /* renamed from: o0, reason: collision with root package name */
    boolean f10447o0;

    /* renamed from: p0, reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f10448p0;

    /* renamed from: q0, reason: collision with root package name */
    private final View.OnKeyListener f10449q0;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i8, boolean z7) {
            if (z7) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f10447o0 || !seekBarPreference.f10442j0) {
                    seekBarPreference.O0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.P0(i8 + seekBarPreference2.f10439g0);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f10442j0 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f10442j0 = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f10439g0 != seekBarPreference.f10438f0) {
                seekBarPreference.O0(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f10445m0 && (i8 == 21 || i8 == 22)) || i8 == 23 || i8 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f10443k0;
            if (seekBar != null) {
                return seekBar.onKeyDown(i8, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f10448p0 = new a();
        this.f10449q0 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10592H0, i8, i9);
        this.f10439g0 = obtainStyledAttributes.getInt(t.f10598K0, 0);
        K0(obtainStyledAttributes.getInt(t.f10594I0, 100));
        L0(obtainStyledAttributes.getInt(t.f10600L0, 0));
        this.f10445m0 = obtainStyledAttributes.getBoolean(t.f10596J0, true);
        this.f10446n0 = obtainStyledAttributes.getBoolean(t.f10602M0, false);
        this.f10447o0 = obtainStyledAttributes.getBoolean(t.f10604N0, false);
        obtainStyledAttributes.recycle();
    }

    private void N0(int i8, boolean z7) {
        int i9 = this.f10439g0;
        if (i8 < i9) {
            i8 = i9;
        }
        int i10 = this.f10440h0;
        if (i8 > i10) {
            i8 = i10;
        }
        if (i8 != this.f10438f0) {
            this.f10438f0 = i8;
            P0(i8);
            j0(i8);
            if (z7) {
                P();
            }
        }
    }

    public final void K0(int i8) {
        int i9 = this.f10439g0;
        if (i8 < i9) {
            i8 = i9;
        }
        if (i8 != this.f10440h0) {
            this.f10440h0 = i8;
            P();
        }
    }

    public final void L0(int i8) {
        if (i8 != this.f10441i0) {
            this.f10441i0 = Math.min(this.f10440h0 - this.f10439g0, Math.abs(i8));
            P();
        }
    }

    public void M0(int i8) {
        N0(i8, true);
    }

    void O0(SeekBar seekBar) {
        int progress = this.f10439g0 + seekBar.getProgress();
        if (progress != this.f10438f0) {
            if (c(Integer.valueOf(progress))) {
                N0(progress, false);
            } else {
                seekBar.setProgress(this.f10438f0 - this.f10439g0);
                P0(this.f10438f0);
            }
        }
    }

    void P0(int i8) {
        TextView textView = this.f10444l0;
        if (textView != null) {
            textView.setText(String.valueOf(i8));
        }
    }

    @Override // androidx.preference.Preference
    public void V(m mVar) {
        super.V(mVar);
        mVar.f10944a.setOnKeyListener(this.f10449q0);
        this.f10443k0 = (SeekBar) mVar.g0(p.f10563c);
        TextView textView = (TextView) mVar.g0(p.f10564d);
        this.f10444l0 = textView;
        if (this.f10446n0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f10444l0 = null;
        }
        SeekBar seekBar = this.f10443k0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f10448p0);
        this.f10443k0.setMax(this.f10440h0 - this.f10439g0);
        int i8 = this.f10441i0;
        if (i8 != 0) {
            this.f10443k0.setKeyProgressIncrement(i8);
        } else {
            this.f10441i0 = this.f10443k0.getKeyProgressIncrement();
        }
        this.f10443k0.setProgress(this.f10438f0 - this.f10439g0);
        P0(this.f10438f0);
        this.f10443k0.setEnabled(L());
    }

    @Override // androidx.preference.Preference
    protected Object Z(TypedArray typedArray, int i8) {
        return Integer.valueOf(typedArray.getInt(i8, 0));
    }

    @Override // androidx.preference.Preference
    protected void c0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(c.class)) {
            super.c0(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.c0(cVar.getSuperState());
        this.f10438f0 = cVar.f10452o;
        this.f10439g0 = cVar.f10453s;
        this.f10440h0 = cVar.f10454t;
        P();
    }

    @Override // androidx.preference.Preference
    protected Parcelable d0() {
        Parcelable d02 = super.d0();
        if (M()) {
            return d02;
        }
        c cVar = new c(d02);
        cVar.f10452o = this.f10438f0;
        cVar.f10453s = this.f10439g0;
        cVar.f10454t = this.f10440h0;
        return cVar;
    }

    @Override // androidx.preference.Preference
    protected void e0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        M0(z(((Integer) obj).intValue()));
    }

    private static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f10452o;

        /* renamed from: s, reason: collision with root package name */
        int f10453s;

        /* renamed from: t, reason: collision with root package name */
        int f10454t;

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
            this.f10452o = parcel.readInt();
            this.f10453s = parcel.readInt();
            this.f10454t = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f10452o);
            parcel.writeInt(this.f10453s);
            parcel.writeInt(this.f10454t);
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.f10557j);
    }
}
