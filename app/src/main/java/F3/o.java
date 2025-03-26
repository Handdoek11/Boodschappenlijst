package f3;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static String f35871a;

    /* renamed from: b, reason: collision with root package name */
    private static int f35872b;

    public static String a() {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        if (f35871a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f35871a = Application.getProcessName();
            } else {
                int i8 = f35872b;
                if (i8 == 0) {
                    i8 = Process.myPid();
                    f35872b = i8;
                }
                String str2 = null;
                str2 = null;
                str2 = null;
                BufferedReader bufferedReader2 = null;
                if (i8 > 0) {
                    try {
                        str = "/proc/" + i8 + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String readLine = bufferedReader.readLine();
                            Z2.r.l(readLine);
                            str2 = readLine.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            k.a(bufferedReader2);
                            throw th;
                        }
                        k.a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                f35871a = str2;
            }
        }
        return f35871a;
    }
}
