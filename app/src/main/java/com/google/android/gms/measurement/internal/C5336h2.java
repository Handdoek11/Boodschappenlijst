package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5336h2 {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f30975b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference f30976c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference f30977d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final w3.i f30978a;

    public C5336h2(w3.i iVar) {
        this.f30978a = iVar;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Z2.r.l(strArr);
        Z2.r.l(strArr2);
        Z2.r.l(atomicReference);
        Z2.r.a(strArr.length == strArr2.length);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (Objects.equals(str, strArr[i8])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i8] == null) {
                            strArr3[i8] = strArr2[i8] + "(" + strArr[i8] + ")";
                        }
                        str2 = strArr3[i8];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String a8 = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (a8 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(a8);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f30978a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String b(E e8) {
        if (e8 == null) {
            return null;
        }
        if (!this.f30978a.zza()) {
            return e8.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(e8.f30334t);
        sb.append(",name=");
        sb.append(c(e8.f30332o));
        sb.append(",params=");
        D d8 = e8.f30333s;
        sb.append(d8 != null ? !this.f30978a.zza() ? d8.toString() : a(d8.D0()) : null);
        return sb.toString();
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f30978a.zza() ? str : d(str, w3.q.f44347c, w3.q.f44345a, f30975b);
    }

    protected final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f30978a.zza() ? str : d(str, w3.s.f44352b, w3.s.f44351a, f30976c);
    }

    protected final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f30978a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, w3.r.f44350b, w3.r.f44349a, f30977d);
        }
        return "experiment_id(" + str + ")";
    }
}
