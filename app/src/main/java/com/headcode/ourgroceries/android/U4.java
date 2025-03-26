package com.headcode.ourgroceries.android;

import android.os.Handler;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s5.S;

/* loaded from: classes2.dex */
public class U4 implements InterfaceC5533e0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5533e0 f34547c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f34548d;

    /* renamed from: e, reason: collision with root package name */
    private final long f34549e;

    /* renamed from: f, reason: collision with root package name */
    private final long f34550f;

    /* renamed from: a, reason: collision with root package name */
    private final Map f34545a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Object f34546b = new Object();

    /* renamed from: g, reason: collision with root package name */
    private boolean f34551g = false;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final S.c f34552a;

        /* renamed from: b, reason: collision with root package name */
        private final String f34553b;

        /* renamed from: c, reason: collision with root package name */
        private final long f34554c;

        public String a() {
            return this.f34553b;
        }

        public S.c b() {
            return this.f34552a;
        }

        public long c() {
            return this.f34554c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f34552a == bVar.f34552a && this.f34553b.equals(bVar.f34553b);
        }

        public int hashCode() {
            return Objects.hash(this.f34552a, this.f34553b);
        }

        public String toString() {
            return "LogMessage{mSeverity=" + this.f34552a + ", mMessage='" + this.f34553b + "', mTimestamp=" + this.f34554c + '}';
        }

        private b(S.c cVar, String str, long j8) {
            this.f34552a = cVar;
            this.f34553b = str;
            this.f34554c = j8;
        }
    }

    public U4(InterfaceC5533e0 interfaceC5533e0, Handler handler, long j8, long j9) {
        this.f34547c = interfaceC5533e0;
        this.f34548d = handler;
        this.f34549e = j8;
        this.f34550f = j9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        List<b> arrayList;
        synchronized (this.f34546b) {
            try {
                this.f34551g = false;
                if (this.f34545a.isEmpty()) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList(this.f34545a.size());
                    for (Map.Entry entry : this.f34545a.entrySet()) {
                        b bVar = (b) entry.getKey();
                        Integer num = (Integer) entry.getValue();
                        String a8 = bVar.a();
                        if (num != null && num.intValue() > 1) {
                            bVar = new b(bVar.b(), a8 + " (" + num + "x)", bVar.c());
                        }
                        arrayList.add(bVar);
                    }
                    this.f34545a.clear();
                    this.f34551g = true;
                    this.f34548d.postDelayed(new T4(this), this.f34550f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (b bVar2 : arrayList) {
            this.f34547c.c(bVar2.b(), bVar2.a(), bVar2.c());
        }
    }

    @Override // com.headcode.ourgroceries.android.InterfaceC5533e0
    public /* synthetic */ void a(S.c cVar, String str) {
        AbstractC5525d0.c(this, cVar, str);
    }

    @Override // com.headcode.ourgroceries.android.InterfaceC5533e0
    public /* synthetic */ void b(String str) {
        AbstractC5525d0.b(this, str);
    }

    @Override // com.headcode.ourgroceries.android.InterfaceC5533e0
    public void c(S.c cVar, String str, long j8) {
        if (j8 == 0) {
            j8 = System.currentTimeMillis();
        }
        b bVar = new b(cVar, str, j8);
        synchronized (this.f34546b) {
            try {
                Integer num = (Integer) this.f34545a.get(bVar);
                this.f34545a.put(bVar, num != null ? Integer.valueOf(num.intValue() + 1) : 1);
                if (!this.f34551g) {
                    this.f34551g = true;
                    this.f34548d.postDelayed(new T4(this), this.f34549e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
