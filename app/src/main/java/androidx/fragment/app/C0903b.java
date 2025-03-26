package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC0922h;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0903b implements Parcelable {
    public static final Parcelable.Creator<C0903b> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    final int f10008A;

    /* renamed from: B, reason: collision with root package name */
    final CharSequence f10009B;

    /* renamed from: C, reason: collision with root package name */
    final ArrayList f10010C;

    /* renamed from: D, reason: collision with root package name */
    final ArrayList f10011D;

    /* renamed from: E, reason: collision with root package name */
    final boolean f10012E;

    /* renamed from: o, reason: collision with root package name */
    final int[] f10013o;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f10014s;

    /* renamed from: t, reason: collision with root package name */
    final int[] f10015t;

    /* renamed from: u, reason: collision with root package name */
    final int[] f10016u;

    /* renamed from: v, reason: collision with root package name */
    final int f10017v;

    /* renamed from: w, reason: collision with root package name */
    final String f10018w;

    /* renamed from: x, reason: collision with root package name */
    final int f10019x;

    /* renamed from: y, reason: collision with root package name */
    final int f10020y;

    /* renamed from: z, reason: collision with root package name */
    final CharSequence f10021z;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0903b createFromParcel(Parcel parcel) {
            return new C0903b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0903b[] newArray(int i8) {
            return new C0903b[i8];
        }
    }

    C0903b(C0902a c0902a) {
        int size = c0902a.f9830c.size();
        this.f10013o = new int[size * 6];
        if (!c0902a.f9836i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f10014s = new ArrayList(size);
        this.f10015t = new int[size];
        this.f10016u = new int[size];
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            E.a aVar = (E.a) c0902a.f9830c.get(i9);
            int i10 = i8 + 1;
            this.f10013o[i8] = aVar.f9847a;
            ArrayList arrayList = this.f10014s;
            Fragment fragment = aVar.f9848b;
            arrayList.add(fragment != null ? fragment.f9908w : null);
            int[] iArr = this.f10013o;
            iArr[i10] = aVar.f9849c ? 1 : 0;
            iArr[i8 + 2] = aVar.f9850d;
            iArr[i8 + 3] = aVar.f9851e;
            int i11 = i8 + 5;
            iArr[i8 + 4] = aVar.f9852f;
            i8 += 6;
            iArr[i11] = aVar.f9853g;
            this.f10015t[i9] = aVar.f9854h.ordinal();
            this.f10016u[i9] = aVar.f9855i.ordinal();
        }
        this.f10017v = c0902a.f9835h;
        this.f10018w = c0902a.f9838k;
        this.f10019x = c0902a.f10006v;
        this.f10020y = c0902a.f9839l;
        this.f10021z = c0902a.f9840m;
        this.f10008A = c0902a.f9841n;
        this.f10009B = c0902a.f9842o;
        this.f10010C = c0902a.f9843p;
        this.f10011D = c0902a.f9844q;
        this.f10012E = c0902a.f9845r;
    }

    private void a(C0902a c0902a) {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            boolean z7 = true;
            if (i8 >= this.f10013o.length) {
                c0902a.f9835h = this.f10017v;
                c0902a.f9838k = this.f10018w;
                c0902a.f9836i = true;
                c0902a.f9839l = this.f10020y;
                c0902a.f9840m = this.f10021z;
                c0902a.f9841n = this.f10008A;
                c0902a.f9842o = this.f10009B;
                c0902a.f9843p = this.f10010C;
                c0902a.f9844q = this.f10011D;
                c0902a.f9845r = this.f10012E;
                return;
            }
            E.a aVar = new E.a();
            int i10 = i8 + 1;
            aVar.f9847a = this.f10013o[i8];
            if (w.G0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0902a + " op #" + i9 + " base fragment #" + this.f10013o[i10]);
            }
            aVar.f9854h = AbstractC0922h.b.values()[this.f10015t[i9]];
            aVar.f9855i = AbstractC0922h.b.values()[this.f10016u[i9]];
            int[] iArr = this.f10013o;
            int i11 = i8 + 2;
            if (iArr[i10] == 0) {
                z7 = false;
            }
            aVar.f9849c = z7;
            int i12 = iArr[i11];
            aVar.f9850d = i12;
            int i13 = iArr[i8 + 3];
            aVar.f9851e = i13;
            int i14 = i8 + 5;
            int i15 = iArr[i8 + 4];
            aVar.f9852f = i15;
            i8 += 6;
            int i16 = iArr[i14];
            aVar.f9853g = i16;
            c0902a.f9831d = i12;
            c0902a.f9832e = i13;
            c0902a.f9833f = i15;
            c0902a.f9834g = i16;
            c0902a.e(aVar);
            i9++;
        }
    }

    public C0902a b(w wVar) {
        C0902a c0902a = new C0902a(wVar);
        a(c0902a);
        c0902a.f10006v = this.f10019x;
        for (int i8 = 0; i8 < this.f10014s.size(); i8++) {
            String str = (String) this.f10014s.get(i8);
            if (str != null) {
                ((E.a) c0902a.f9830c.get(i8)).f9848b = wVar.e0(str);
            }
        }
        c0902a.q(1);
        return c0902a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeIntArray(this.f10013o);
        parcel.writeStringList(this.f10014s);
        parcel.writeIntArray(this.f10015t);
        parcel.writeIntArray(this.f10016u);
        parcel.writeInt(this.f10017v);
        parcel.writeString(this.f10018w);
        parcel.writeInt(this.f10019x);
        parcel.writeInt(this.f10020y);
        TextUtils.writeToParcel(this.f10021z, parcel, 0);
        parcel.writeInt(this.f10008A);
        TextUtils.writeToParcel(this.f10009B, parcel, 0);
        parcel.writeStringList(this.f10010C);
        parcel.writeStringList(this.f10011D);
        parcel.writeInt(this.f10012E ? 1 : 0);
    }

    C0903b(Parcel parcel) {
        this.f10013o = parcel.createIntArray();
        this.f10014s = parcel.createStringArrayList();
        this.f10015t = parcel.createIntArray();
        this.f10016u = parcel.createIntArray();
        this.f10017v = parcel.readInt();
        this.f10018w = parcel.readString();
        this.f10019x = parcel.readInt();
        this.f10020y = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f10021z = (CharSequence) creator.createFromParcel(parcel);
        this.f10008A = parcel.readInt();
        this.f10009B = (CharSequence) creator.createFromParcel(parcel);
        this.f10010C = parcel.createStringArrayList();
        this.f10011D = parcel.createStringArrayList();
        this.f10012E = parcel.readInt() != 0;
    }
}
