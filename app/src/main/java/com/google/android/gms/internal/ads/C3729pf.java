package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.adadapted.android.sdk.core.ad.AdActionType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.pf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3729pf {

    /* renamed from: d, reason: collision with root package name */
    String f25479d;

    /* renamed from: e, reason: collision with root package name */
    Context f25480e;

    /* renamed from: f, reason: collision with root package name */
    String f25481f;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f25483h;

    /* renamed from: i, reason: collision with root package name */
    private File f25484i;

    /* renamed from: a, reason: collision with root package name */
    final BlockingQueue f25476a = new ArrayBlockingQueue(100);

    /* renamed from: b, reason: collision with root package name */
    final LinkedHashMap f25477b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f25478c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashSet f25482g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(C3729pf c3729pf) {
        while (true) {
            try {
                C4818zf c4818zf = (C4818zf) c3729pf.f25476a.take();
                C4709yf a8 = c4818zf.a();
                if (!TextUtils.isEmpty(a8.b())) {
                    c3729pf.g(c3729pf.b(c3729pf.f25477b, c4818zf.b()), a8);
                }
            } catch (InterruptedException e8) {
                H2.p.h("CsiReporter:reporter interrupted", e8);
                return;
            }
        }
    }

    private final void g(Map map, C4709yf c4709yf) {
        Uri.Builder buildUpon = Uri.parse(this.f25479d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (c4709yf != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(c4709yf.b())) {
                sb.append("&it=");
                sb.append(c4709yf.b());
            }
            if (!TextUtils.isEmpty(c4709yf.a())) {
                sb.append("&blat=");
                sb.append(c4709yf.a());
            }
            uri = sb.toString();
        }
        if (!this.f25483h.get()) {
            C2.v.t();
            G2.D0.m(this.f25480e, this.f25481f, uri);
            return;
        }
        File file = this.f25484i;
        if (file == null) {
            H2.p.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(uri.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e8) {
                        H2.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e8);
                    }
                } catch (IOException e9) {
                    e = e9;
                    fileOutputStream = fileOutputStream2;
                    H2.p.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                            H2.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                            H2.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    public final AbstractC4382vf a(String str) {
        AbstractC4382vf abstractC4382vf = (AbstractC4382vf) this.f25478c.get(str);
        return abstractC4382vf != null ? abstractC4382vf : AbstractC4382vf.f27316a;
    }

    final Map b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, a(str).a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f25480e = context;
        this.f25481f = str;
        this.f25479d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f25483h = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC2752gg.f22416c.e()).booleanValue());
        if (this.f25483h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f25484i = new File(AbstractC1228Dd0.a(AbstractC1192Cd0.a(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f25477b.put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.of
            @Override // java.lang.Runnable
            public final void run() {
                C3729pf.c(this.f25247o);
            }
        });
        Map map2 = this.f25478c;
        AbstractC4382vf abstractC4382vf = AbstractC4382vf.f27317b;
        map2.put("action", abstractC4382vf);
        this.f25478c.put("ad_format", abstractC4382vf);
        this.f25478c.put(AdActionType.EXTERNAL_LINK, AbstractC4382vf.f27318c);
    }

    public final void e(String str) {
        if (this.f25482g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f25481f);
        linkedHashMap.put("ue", str);
        g(b(this.f25477b, linkedHashMap), null);
    }

    public final boolean f(C4818zf c4818zf) {
        return this.f25476a.offer(c4818zf);
    }
}
