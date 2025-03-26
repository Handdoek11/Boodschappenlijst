package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class N2 implements K2 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f28948a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private HashMap f28949b = null;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f28950c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f28951d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f28952e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f28953f = new HashMap(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private Object f28954g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28955h = false;

    /* renamed from: i, reason: collision with root package name */
    private String[] f28956i = new String[0];

    /* renamed from: j, reason: collision with root package name */
    private final Q2 f28957j = new O2();

    @Override // com.google.android.gms.internal.measurement.K2
    public final String a(ContentResolver contentResolver, String str, String str2) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                if (this.f28949b == null) {
                    this.f28948a.set(false);
                    this.f28949b = new HashMap(16, 1.0f);
                    this.f28954g = new Object();
                    contentResolver.registerContentObserver(I2.f28890a, true, new P2(this, null));
                } else if (this.f28948a.getAndSet(false)) {
                    this.f28949b.clear();
                    this.f28950c.clear();
                    this.f28951d.clear();
                    this.f28952e.clear();
                    this.f28953f.clear();
                    this.f28954g = new Object();
                    this.f28955h = false;
                }
                Object obj = this.f28954g;
                if (this.f28949b.containsKey(str)) {
                    String str3 = (String) this.f28949b.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : this.f28956i) {
                    if (str.startsWith(str4)) {
                        if (!this.f28955h) {
                            try {
                                HashMap hashMap = (HashMap) this.f28957j.b(contentResolver, this.f28956i, new R2() { // from class: com.google.android.gms.internal.measurement.M2
                                    @Override // com.google.android.gms.internal.measurement.R2
                                    public final Map m(int i8) {
                                        return new HashMap(i8, 1.0f);
                                    }
                                });
                                if (!hashMap.isEmpty()) {
                                    Set keySet = hashMap.keySet();
                                    keySet.removeAll(this.f28950c.keySet());
                                    keySet.removeAll(this.f28951d.keySet());
                                    keySet.removeAll(this.f28952e.keySet());
                                    keySet.removeAll(this.f28953f.keySet());
                                }
                                if (!hashMap.isEmpty()) {
                                    if (this.f28949b.isEmpty()) {
                                        this.f28949b = hashMap;
                                    } else {
                                        this.f28949b.putAll(hashMap);
                                    }
                                }
                                this.f28955h = true;
                            } catch (zzgt unused) {
                            }
                            if (this.f28949b.containsKey(str)) {
                                String str5 = (String) this.f28949b.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    String a8 = this.f28957j.a(contentResolver, str);
                    if (a8 != null && a8.equals(null)) {
                        a8 = null;
                    }
                    synchronized (this) {
                        try {
                            if (obj == this.f28954g) {
                                this.f28949b.put(str, a8);
                            }
                        } finally {
                        }
                    }
                    if (a8 != null) {
                        return a8;
                    }
                    return null;
                } catch (zzgt unused2) {
                    return null;
                }
            } finally {
            }
        }
    }
}
