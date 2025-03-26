package q0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import p0.e;
import w0.l;

/* loaded from: classes.dex */
public class m extends n {
    private Font i(FontFamily fontFamily, int i8) {
        FontStyle fontStyle = new FontStyle((i8 & 1) != 0 ? 700 : 400, (i8 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int k8 = k(fontStyle, font.getStyle());
        for (int i9 = 1; i9 < fontFamily.getSize(); i9++) {
            Font font2 = fontFamily.getFont(i9);
            int k9 = k(fontStyle, font2.getStyle());
            if (k9 < k8) {
                font = font2;
                k8 = k9;
            }
        }
        return font;
    }

    private static FontFamily j(CancellationSignal cancellationSignal, l.b[] bVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (l.b bVar : bVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
            } catch (IOException e8) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                }
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    private static int k(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // q0.n
    public Typeface a(Context context, e.c cVar, Resources resources, int i8) {
        try {
            FontFamily.Builder builder = null;
            for (e.d dVar : cVar.a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(i(build2, i8).getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // q0.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i8) {
        try {
            FontFamily j8 = j(cancellationSignal, bVarArr, context.getContentResolver());
            if (j8 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(j8).setStyle(i(j8, i8).getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // q0.n
    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i8) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily j8 = j(cancellationSignal, (l.b[]) list.get(0), contentResolver);
            if (j8 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(j8);
            for (int i9 = 1; i9 < list.size(); i9++) {
                FontFamily j9 = j(cancellationSignal, (l.b[]) list.get(i9), contentResolver);
                if (j9 != null) {
                    customFallbackBuilder.addCustomFallback(j9);
                }
            }
            return customFallbackBuilder.setStyle(i(j8, i8).getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // q0.n
    public Typeface e(Context context, Resources resources, int i8, String str, int i9) {
        try {
            Font build = new Font.Builder(resources, i8).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // q0.n
    protected l.b h(l.b[] bVarArr, int i8) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
