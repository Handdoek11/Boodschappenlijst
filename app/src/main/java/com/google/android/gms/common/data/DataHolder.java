package com.google.android.gms.common.data;

import Z2.r;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends AbstractC0813a implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    private boolean f13397A;

    /* renamed from: o, reason: collision with root package name */
    final int f13398o;

    /* renamed from: s, reason: collision with root package name */
    private final String[] f13399s;

    /* renamed from: t, reason: collision with root package name */
    Bundle f13400t;

    /* renamed from: u, reason: collision with root package name */
    private final CursorWindow[] f13401u;

    /* renamed from: v, reason: collision with root package name */
    private final int f13402v;

    /* renamed from: w, reason: collision with root package name */
    private final Bundle f13403w;

    /* renamed from: x, reason: collision with root package name */
    int[] f13404x;

    /* renamed from: y, reason: collision with root package name */
    int f13405y;

    /* renamed from: z, reason: collision with root package name */
    boolean f13406z;
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: B, reason: collision with root package name */
    private static final a f13396B = new com.google.android.gms.common.data.a(new String[0], null);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f13407a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f13408b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f13409c = new HashMap();
    }

    DataHolder(int i8, String[] strArr, CursorWindow[] cursorWindowArr, int i9, Bundle bundle) {
        this.f13406z = false;
        this.f13397A = true;
        this.f13398o = i8;
        this.f13399s = strArr;
        this.f13401u = cursorWindowArr;
        this.f13402v = i9;
        this.f13403w = bundle;
    }

    public static DataHolder A0(int i8) {
        return new DataHolder(f13396B, i8, null);
    }

    private final void J0(String str, int i8) {
        Bundle bundle = this.f13400t;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (H0()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i8 < 0 || i8 >= this.f13405y) {
            throw new CursorIndexOutOfBoundsException(i8, this.f13405y);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        if (r5 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        android.util.Log.d("DataHolder", "Couldn't populate window data for row " + r4 + " - allocating new window.");
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r13.f13407a.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
    
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.database.CursorWindow[] K0(com.google.android.gms.common.data.DataHolder.a r13, int r14) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.K0(com.google.android.gms.common.data.DataHolder$a, int):android.database.CursorWindow[]");
    }

    public byte[] B0(String str, int i8, int i9) {
        J0(str, i8);
        return this.f13401u[i9].getBlob(i8, this.f13400t.getInt(str));
    }

    public int C0(String str, int i8, int i9) {
        J0(str, i8);
        return this.f13401u[i9].getInt(i8, this.f13400t.getInt(str));
    }

    public Bundle D0() {
        return this.f13403w;
    }

    public int E0() {
        return this.f13402v;
    }

    public String F0(String str, int i8, int i9) {
        J0(str, i8);
        return this.f13401u[i9].getString(i8, this.f13400t.getInt(str));
    }

    public int G0(int i8) {
        int length;
        int i9 = 0;
        r.p(i8 >= 0 && i8 < this.f13405y);
        while (true) {
            int[] iArr = this.f13404x;
            length = iArr.length;
            if (i9 >= length) {
                break;
            }
            if (i8 < iArr[i9]) {
                i9--;
                break;
            }
            i9++;
        }
        return i9 == length ? i9 - 1 : i9;
    }

    public boolean H0() {
        boolean z7;
        synchronized (this) {
            z7 = this.f13406z;
        }
        return z7;
    }

    public final void I0() {
        this.f13400t = new Bundle();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr = this.f13399s;
            if (i9 >= strArr.length) {
                break;
            }
            this.f13400t.putInt(strArr[i9], i9);
            i9++;
        }
        this.f13404x = new int[this.f13401u.length];
        int i10 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f13401u;
            if (i8 >= cursorWindowArr.length) {
                this.f13405y = i10;
                return;
            }
            this.f13404x[i8] = i10;
            i10 += this.f13401u[i8].getNumRows() - (i10 - cursorWindowArr[i8].getStartPosition());
            i8++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f13406z) {
                    this.f13406z = true;
                    int i8 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f13401u;
                        if (i8 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i8].close();
                        i8++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f13397A && this.f13401u.length > 0 && !H0()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.f13405y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String[] strArr = this.f13399s;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.t(parcel, 1, strArr, false);
        AbstractC0814b.v(parcel, 2, this.f13401u, i8, false);
        AbstractC0814b.m(parcel, 3, E0());
        AbstractC0814b.e(parcel, 4, D0(), false);
        AbstractC0814b.m(parcel, 1000, this.f13398o);
        AbstractC0814b.b(parcel, a8);
        if ((i8 & 1) != 0) {
            close();
        }
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i8, Bundle bundle) {
        this.f13406z = false;
        this.f13397A = true;
        this.f13398o = 1;
        this.f13399s = (String[]) r.l(strArr);
        this.f13401u = (CursorWindow[]) r.l(cursorWindowArr);
        this.f13402v = i8;
        this.f13403w = bundle;
        I0();
    }

    private DataHolder(a aVar, int i8, Bundle bundle) {
        this(aVar.f13407a, K0(aVar, -1), i8, null);
    }
}
