package C3;

import B3.InterfaceC0384c;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: C3.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0434j extends AbstractC0813a implements InterfaceC0384c {
    public static final Parcelable.Creator<C0434j> CREATOR = new C0437k();

    /* renamed from: s, reason: collision with root package name */
    private final String f982s;

    /* renamed from: t, reason: collision with root package name */
    private final List f983t;

    /* renamed from: o, reason: collision with root package name */
    private final Object f981o = new Object();

    /* renamed from: u, reason: collision with root package name */
    private Set f984u = null;

    public C0434j(String str, List list) {
        this.f982s = str;
        this.f983t = list;
        Z2.r.l(str);
        Z2.r.l(list);
    }

    @Override // B3.InterfaceC0384c
    public final Set X() {
        Set set;
        synchronized (this.f981o) {
            try {
                if (this.f984u == null) {
                    this.f984u = new HashSet(this.f983t);
                }
                set = this.f984u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0434j.class != obj.getClass()) {
            return false;
        }
        C0434j c0434j = (C0434j) obj;
        String str = this.f982s;
        if (str == null ? c0434j.f982s != null : !str.equals(c0434j.f982s)) {
            return false;
        }
        List list = this.f983t;
        return list == null ? c0434j.f983t == null : list.equals(c0434j.f983t);
    }

    @Override // B3.InterfaceC0384c
    public final String getName() {
        return this.f982s;
    }

    public final int hashCode() {
        String str = this.f982s;
        int hashCode = str != null ? str.hashCode() : 0;
        List list = this.f983t;
        return ((hashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CapabilityInfo{" + this.f982s + ", " + String.valueOf(this.f983t) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f982s;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.w(parcel, 3, this.f983t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
