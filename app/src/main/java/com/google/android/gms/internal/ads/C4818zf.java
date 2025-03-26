package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4818zf {

    /* renamed from: a, reason: collision with root package name */
    private final List f28686a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f28687b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f28688c;

    public C4818zf(boolean z7, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f28687b = linkedHashMap;
        this.f28688c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final C4491wf f() {
        return new C4491wf(C2.v.c().b(), null, null);
    }

    public final C4709yf a() {
        C4709yf c4709yf;
        boolean booleanValue = ((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f28688c) {
            try {
                for (C4491wf c4491wf : this.f28686a) {
                    long a8 = c4491wf.a();
                    String c8 = c4491wf.c();
                    C4491wf b8 = c4491wf.b();
                    if (b8 != null && a8 > 0) {
                        long a9 = a8 - b8.a();
                        sb.append(c8);
                        sb.append('.');
                        sb.append(a9);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(b8.a()))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b8.a()));
                                sb2.append('+');
                                sb2.append(c8);
                            } else {
                                hashMap.put(Long.valueOf(b8.a()), new StringBuilder(c8));
                            }
                        }
                    }
                }
                this.f28686a.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(C2.v.c().a() + (((Long) entry.getKey()).longValue() - C2.v.c().b()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                c4709yf = new C4709yf(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4709yf;
    }

    public final Map b() {
        Map map;
        synchronized (this.f28688c) {
            C2.v.s().h();
            map = this.f28687b;
        }
        return map;
    }

    public final void c(C4818zf c4818zf) {
        synchronized (this.f28688c) {
        }
    }

    public final void d(String str, String str2) {
        C3729pf h8;
        if (TextUtils.isEmpty(str2) || (h8 = C2.v.s().h()) == null) {
            return;
        }
        synchronized (this.f28688c) {
            AbstractC4382vf a8 = h8.a(str);
            Map map = this.f28687b;
            map.put(str, a8.a((String) map.get(str), str2));
        }
    }

    public final boolean e(C4491wf c4491wf, long j8, String... strArr) {
        synchronized (this.f28688c) {
            this.f28686a.add(new C4491wf(j8, strArr[0], c4491wf));
        }
        return true;
    }
}
