package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import q.C6407k;

/* renamed from: com.google.android.gms.internal.measurement.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4918g3 {

    /* renamed from: com.google.android.gms.internal.measurement.g3$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static volatile b4.g f29307a;

        public static b4.g a(Context context) {
            b4.g a8;
            b4.g gVar = f29307a;
            if (gVar == null) {
                synchronized (a.class) {
                    try {
                        gVar = f29307a;
                        if (gVar == null) {
                            new C4918g3();
                            if (AbstractC4954k3.c(Build.TYPE, Build.TAGS)) {
                                if (T2.a() && !context.isDeviceProtectedStorage()) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                                a8 = C4918g3.a(context);
                            } else {
                                a8 = b4.g.a();
                            }
                            f29307a = a8;
                            gVar = a8;
                        }
                    } finally {
                    }
                }
            }
            return gVar;
        }
    }

    static b4.g a(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            b4.g d8 = d(context);
            b4.g d9 = d8.c() ? b4.g.d(b(context, (File) d8.b())) : b4.g.a();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d9;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static InterfaceC4927h3 b(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                C6407k c6407k = new C6407k();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        Y2 y22 = new Y2(c6407k);
                        bufferedReader.close();
                        return y22;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String c8 = c(split[0]);
                        String decode = Uri.decode(c(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String c9 = c(split[2]);
                            str = Uri.decode(c9);
                            if (str.length() < 1024 || str == c9) {
                                hashMap.put(c9, str);
                            }
                        }
                        C6407k c6407k2 = (C6407k) c6407k.get(c8);
                        if (c6407k2 == null) {
                            c6407k2 = new C6407k();
                            c6407k.put(c8, c6407k2);
                        }
                        c6407k2.put(decode, str);
                    }
                }
            } finally {
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static final String c(String str) {
        return new String(str);
    }

    private static b4.g d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? b4.g.d(file) : b4.g.a();
        } catch (RuntimeException e8) {
            Log.e("HermeticFileOverrides", "no data dir", e8);
            return b4.g.a();
        }
    }
}
