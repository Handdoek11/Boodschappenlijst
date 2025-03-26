package q0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p0.e;
import w0.l;

/* loaded from: classes.dex */
class i extends n {

    /* renamed from: b, reason: collision with root package name */
    private static Class f40909b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor f40910c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f40911d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f40912e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f40913f = false;

    i() {
    }

    private static boolean i(Object obj, String str, int i8, boolean z7) {
        l();
        try {
            return ((Boolean) f40911d.invoke(obj, str, Integer.valueOf(i8), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static Typeface j(Object obj) {
        l();
        try {
            Object newInstance = Array.newInstance((Class<?>) f40909b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f40912e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    private File k(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void l() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f40913f) {
            return;
        }
        f40913f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi21Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f40910c = constructor;
        f40909b = cls;
        f40911d = method2;
        f40912e = method;
    }

    private static Object m() {
        l();
        try {
            return f40910c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // q0.n
    public Typeface a(Context context, e.c cVar, Resources resources, int i8) {
        Object m8 = m();
        for (e.d dVar : cVar.a()) {
            File e8 = o.e(context);
            if (e8 == null) {
                return null;
            }
            try {
                if (!o.c(e8, resources, dVar.b())) {
                    return null;
                }
                if (!i(m8, e8.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                e8.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e8.delete();
            }
        }
        return j(m8);
    }

    @Override // q0.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i8) {
        if (bVarArr.length < 1) {
            return null;
        }
        l.b h8 = h(bVarArr, i8);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h8.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File k8 = k(openFileDescriptor);
                if (k8 != null && k8.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(k8);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface d8 = super.d(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return d8;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
