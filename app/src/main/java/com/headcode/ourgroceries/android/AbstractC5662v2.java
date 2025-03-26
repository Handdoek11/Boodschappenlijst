package com.headcode.ourgroceries.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.app.AbstractActivityC0835d;
import androidx.core.content.FileProvider;
import androidx.lifecycle.AbstractC0922h;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import q5.AbstractC6635a;
import t5.AbstractC6804f;

/* renamed from: com.headcode.ourgroceries.android.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5662v2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.InputStream] */
    public static String a(AbstractActivityC0835d abstractActivityC0835d, int i8, Intent intent) {
        ParcelFileDescriptor parcelFileDescriptor;
        FileInputStream fileInputStream;
        String str = null;
        str = null;
        ?? r22 = 0;
        str = null;
        ?? r23 = 0;
        if (i8 == 6) {
            File e8 = e(abstractActivityC0835d);
            try {
                if (e8 == null) {
                    m(abstractActivityC0835d);
                    return null;
                }
                try {
                    fileInputStream = new FileInputStream(e8);
                } catch (IOException unused) {
                    fileInputStream = null;
                } catch (OutOfMemoryError e9) {
                    e = e9;
                    fileInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    P1.e(r22);
                    e8.delete();
                    throw th;
                }
                try {
                    str = i(abstractActivityC0835d, fileInputStream.getFD(), "Camera");
                } catch (IOException unused2) {
                    AbstractC5673x.a("errorCameraPhotoIo");
                    n(abstractActivityC0835d);
                    P1.e(fileInputStream);
                    e8.delete();
                    return null;
                } catch (OutOfMemoryError e10) {
                    e = e10;
                    AbstractC5673x.a("errorCameraPhotoOom");
                    AbstractC6635a.g("OG-Photos", e);
                    P1.e(fileInputStream);
                    e8.delete();
                    return str;
                }
                P1.e(fileInputStream);
                e8.delete();
            } catch (Throwable th2) {
                th = th2;
                r22 = intent;
            }
        } else if (i8 == 7) {
            Uri data = intent.getData();
            try {
                if (data == null) {
                    n(abstractActivityC0835d);
                    return null;
                }
                try {
                    parcelFileDescriptor = abstractActivityC0835d.getContentResolver().openFileDescriptor(data, "r");
                } catch (IOException unused3) {
                    parcelFileDescriptor = null;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    parcelFileDescriptor = null;
                } catch (Throwable th3) {
                    th = th3;
                    P1.d(r23);
                    throw th;
                }
                try {
                } catch (IOException unused4) {
                    AbstractC5673x.a("errorChoosePhotoIo");
                    n(abstractActivityC0835d);
                    P1.d(parcelFileDescriptor);
                    return null;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    AbstractC5673x.a("errorChoosePhotoOom");
                    AbstractC6635a.g("OG-Photos", e);
                    P1.d(parcelFileDescriptor);
                    return str;
                }
                if (parcelFileDescriptor == null) {
                    n(abstractActivityC0835d);
                    P1.d(parcelFileDescriptor);
                    return null;
                }
                str = i(abstractActivityC0835d, parcelFileDescriptor.getFileDescriptor(), "Choose");
                P1.d(parcelFileDescriptor);
            } catch (Throwable th4) {
                th = th4;
                r23 = data;
            }
        }
        return str;
    }

    public static void b(Activity activity) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        activity.startActivityForResult(Intent.createChooser(intent, activity.getString(M2.f33932N3)), 7);
    }

    private static void c(Context context) {
        File[] listFiles;
        File h8 = h(context);
        if (h8 == null || (listFiles = h8.listFiles(P1.j("jpg"))) == null) {
            return;
        }
        Arrays.sort(listFiles, P1.f34313e);
        for (int i8 = 0; i8 < listFiles.length - 5; i8++) {
            AbstractC6635a.a("OG-Photos", "Deleting oldest cached photo " + listFiles[i8]);
            listFiles[i8].delete();
        }
    }

    private static File d(Context context) {
        if ("huawei".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 24) {
            return context.getCacheDir();
        }
        File externalCacheDir = context.getExternalCacheDir();
        return externalCacheDir == null ? context.getCacheDir() : externalCacheDir;
    }

    private static File e(Context context) {
        File d8 = d(context);
        if (d8 == null) {
            AbstractC5673x.a("errorCameraNoExternalCacheDir");
            AbstractC6635a.f("OG-Photos", "Cannot get external cache directory for photos");
            return null;
        }
        File file = new File(d8, "camera_photo");
        file.mkdir();
        if (file.isDirectory()) {
            return new File(file, "camera_photo.jpg");
        }
        AbstractC5673x.a("errorCameraCannotCreateDir");
        AbstractC6635a.f("OG-Photos", "Cannot create directory " + file);
        return null;
    }

    private static int f(androidx.exifinterface.media.a aVar) {
        return aVar.c("Orientation", 1);
    }

    public static File g(Context context, String str) {
        File h8 = h(context);
        if (h8 == null) {
            return null;
        }
        return new File(h8, str + ".jpg");
    }

    private static File h(Context context) {
        File d8 = d(context);
        if (d8 == null) {
            return null;
        }
        File file = new File(d8, "photos");
        file.mkdirs();
        return file;
    }

    private static String i(AbstractActivityC0835d abstractActivityC0835d, FileDescriptor fileDescriptor, String str) {
        Bitmap j8 = j(fileDescriptor, str);
        if (j8 == null) {
            AbstractC5673x.a("error" + str + "PhotoDecode");
            n(abstractActivityC0835d);
            return null;
        }
        String a8 = AbstractC6804f.a();
        File g8 = g(abstractActivityC0835d, a8);
        if (g8 == null) {
            m(abstractActivityC0835d);
            return null;
        }
        c(abstractActivityC0835d);
        k(j8, g8);
        AbstractC5673x.a("saved" + str + "Photo");
        return a8;
    }

    private static Bitmap j(FileDescriptor fileDescriptor, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        int i8 = options.outWidth;
        int i9 = options.outHeight;
        AbstractC6635a.a("OG-Photos", "Size of photo: " + i8 + "x" + i9);
        int max = Math.max(Math.min(Math.min(i8 / 1024, i9 / 1024) / 2, 8), 1);
        StringBuilder sb = new StringBuilder();
        sb.append("Input sample size: ");
        sb.append(max);
        AbstractC6635a.a("OG-Photos", sb.toString());
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = max;
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options2);
            if (decodeFileDescriptor == null) {
                return null;
            }
            int width = decodeFileDescriptor.getWidth();
            int height = decodeFileDescriptor.getHeight();
            AbstractC6635a.a("OG-Photos", "Size of loaded photo: " + width + "x" + height);
            Matrix matrix = new Matrix();
            if (width > 1024 && height > 1024) {
                float min = width > height ? Math.min(4096.0f / width, 1024.0f / height) : Math.min(1024.0f / width, 4096.0f / height);
                AbstractC6635a.a("OG-Photos", "Scale: " + min);
                matrix.setScale(min, min);
            }
            int f8 = f(new androidx.exifinterface.media.a(fileDescriptor));
            AbstractC5673x.a("photoOrient" + f8);
            AbstractC6635a.a("OG-Photos", "Rotating/flipping to account for exif orientation " + f8);
            float f9 = ((float) width) / 2.0f;
            float f10 = ((float) height) / 2.0f;
            switch (f8) {
                case 2:
                    matrix.preTranslate(-width, 0.0f);
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.preRotate(180.0f, f9, f10);
                    break;
                case 4:
                    matrix.preTranslate(0.0f, -height);
                    matrix.preScale(1.0f, -1.0f);
                    break;
                case 5:
                    matrix.preRotate(-90.0f, f9, f10);
                    matrix.preTranslate(-width, 0.0f);
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix.preRotate(90.0f, f9, f10);
                    break;
                case 7:
                    matrix.preRotate(90.0f, f9, f10);
                    matrix.preTranslate(-width, 0.0f);
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.preRotate(270.0f, f9, f10);
                    break;
            }
            Bitmap createBitmap = Bitmap.createBitmap(decodeFileDescriptor, 0, 0, width, height, matrix, true);
            AbstractC6635a.a("OG-Photos", "Resized size: " + createBitmap.getWidth() + "x" + createBitmap.getHeight());
            return createBitmap;
        } catch (OutOfMemoryError e8) {
            com.google.firebase.crashlytics.a.b().e(e8);
            AbstractC5673x.a("error" + str + "PhotoDecodeOom");
            AbstractC6635a.c("OG-Photos", e8);
            return null;
        }
    }

    private static void k(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            P1.f(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            P1.f(fileOutputStream2);
            throw th;
        }
    }

    public static void l(AbstractActivityC0835d abstractActivityC0835d, Z0 z02, String str) {
        AbstractC0922h.b b8 = abstractActivityC0835d.getLifecycle().b();
        if (b8 != AbstractC0922h.b.RESUMED) {
            AbstractC6635a.f("OG-Photos", "Ignoring photo tap because lifecycle state is " + b8);
            return;
        }
        AbstractC5673x.a(str + "Photo");
        AbstractC5625q.s(abstractActivityC0835d, z02.E(), z02.y(), z02.A());
    }

    private static void m(AbstractActivityC0835d abstractActivityC0835d) {
        AbstractC5673x.a("errorCameraPhotoDir");
        o5.T.t2().d(M2.f33882H1).g(abstractActivityC0835d);
    }

    private static void n(AbstractActivityC0835d abstractActivityC0835d) {
        o5.T.t2().d(M2.f33890I1).g(abstractActivityC0835d);
    }

    public static void o(AbstractActivityC0835d abstractActivityC0835d) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(abstractActivityC0835d.getPackageManager()) == null) {
            AbstractC5673x.a("errorCameraNoCameraApp");
            AbstractC6635a.b("OG-Photos", "No camera app");
            return;
        }
        File e8 = e(abstractActivityC0835d);
        if (e8 == null) {
            m(abstractActivityC0835d);
            return;
        }
        intent.putExtra("output", Build.VERSION.SDK_INT < 24 ? Uri.fromFile(e8) : FileProvider.h(abstractActivityC0835d, "com.headcode.ourgroceries.fileprovider", e8));
        intent.addFlags(2);
        abstractActivityC0835d.startActivityForResult(intent, 6);
    }
}
