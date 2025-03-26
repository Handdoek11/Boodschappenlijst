package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f9198k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f9199a;

    /* renamed from: b, reason: collision with root package name */
    Object f9200b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f9201c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f9202d;

    /* renamed from: e, reason: collision with root package name */
    public int f9203e;

    /* renamed from: f, reason: collision with root package name */
    public int f9204f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f9205g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f9206h;

    /* renamed from: i, reason: collision with root package name */
    public String f9207i;

    /* renamed from: j, reason: collision with root package name */
    public String f9208j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e8);
                return -1;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e9);
                return -1;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            }
        }

        static Icon e(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f9199a) {
                case -1:
                    return (Icon) iconCompat.f9200b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f9200b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.f(), iconCompat.f9203e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f9200b, iconCompat.f9203e, iconCompat.f9204f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f9200b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f9200b, false));
                        break;
                    } else {
                        createWithBitmap = b.a((Bitmap) iconCompat.f9200b);
                        break;
                    }
                case 6:
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 30) {
                        createWithBitmap = d.a(iconCompat.h());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                        }
                        InputStream i9 = iconCompat.i(context);
                        if (i9 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                        }
                        if (i8 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(i9), false));
                            break;
                        } else {
                            createWithBitmap = b.a(BitmapFactory.decodeStream(i9));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f9205g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f9206h;
            if (mode != IconCompat.f9198k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f9199a = -1;
        this.f9201c = null;
        this.f9202d = null;
        this.f9203e = 0;
        this.f9204f = 0;
        this.f9205g = null;
        this.f9206h = f9198k;
        this.f9207i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z7) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f8 = min;
        float f9 = 0.5f * f8;
        float f10 = 0.9166667f * f9;
        if (z7) {
            float f11 = 0.010416667f * f8;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f8 * 0.020833334f, 1023410176);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f9, f9, f10, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        y0.d.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f9200b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i8) {
        y0.d.c(str);
        if (i8 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f9203e = i8;
        if (resources != null) {
            try {
                iconCompat.f9200b = resources.getResourceName(i8);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f9200b = str;
        }
        iconCompat.f9208j = str;
        return iconCompat;
    }

    private static String n(int i8) {
        switch (i8) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i8 = this.f9199a;
        if (i8 == -1) {
            Object obj = this.f9200b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i8 == 1) {
            return (Bitmap) this.f9200b;
        }
        if (i8 == 5) {
            return a((Bitmap) this.f9200b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int e() {
        int i8 = this.f9199a;
        if (i8 == -1) {
            return a.a(this.f9200b);
        }
        if (i8 == 2) {
            return this.f9203e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i8 = this.f9199a;
        if (i8 == -1) {
            return a.b(this.f9200b);
        }
        if (i8 == 2) {
            String str = this.f9208j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f9200b).split(":", -1)[0] : this.f9208j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i8 = this.f9199a;
        return i8 == -1 ? a.c(this.f9200b) : i8;
    }

    public Uri h() {
        int i8 = this.f9199a;
        if (i8 == -1) {
            return a.d(this.f9200b);
        }
        if (i8 == 4 || i8 == 6) {
            return Uri.parse((String) this.f9200b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        Uri h8 = h();
        String scheme = h8.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h8);
            } catch (Exception e8) {
                Log.w("IconCompat", "Unable to load image from URI: " + h8, e8);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f9200b));
        } catch (FileNotFoundException e9) {
            Log.w("IconCompat", "Unable to load image from path: " + h8, e9);
            return null;
        }
    }

    public void j() {
        this.f9206h = PorterDuff.Mode.valueOf(this.f9207i);
        switch (this.f9199a) {
            case -1:
                Parcelable parcelable = this.f9202d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f9200b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f9202d;
                if (parcelable2 != null) {
                    this.f9200b = parcelable2;
                    return;
                }
                byte[] bArr = this.f9201c;
                this.f9200b = bArr;
                this.f9199a = 3;
                this.f9203e = 0;
                this.f9204f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f9201c, Charset.forName("UTF-16"));
                this.f9200b = str;
                if (this.f9199a == 2 && this.f9208j == null) {
                    this.f9208j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f9200b = this.f9201c;
                return;
        }
    }

    public void k(boolean z7) {
        this.f9207i = this.f9206h.name();
        switch (this.f9199a) {
            case -1:
                if (z7) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f9202d = (Parcelable) this.f9200b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z7) {
                    this.f9202d = (Parcelable) this.f9200b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f9200b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f9201c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f9201c = ((String) this.f9200b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f9201c = (byte[]) this.f9200b;
                return;
            case 4:
            case 6:
                this.f9201c = this.f9200b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Icon l() {
        return m(null);
    }

    public Icon m(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f9199a == -1) {
            return String.valueOf(this.f9200b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(n(this.f9199a));
        switch (this.f9199a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f9200b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f9200b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f9208j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f9203e);
                if (this.f9204f != 0) {
                    sb.append(" off=");
                    sb.append(this.f9204f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f9200b);
                break;
        }
        if (this.f9205g != null) {
            sb.append(" tint=");
            sb.append(this.f9205g);
        }
        if (this.f9206h != f9198k) {
            sb.append(" mode=");
            sb.append(this.f9206h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i8) {
        this.f9201c = null;
        this.f9202d = null;
        this.f9203e = 0;
        this.f9204f = 0;
        this.f9205g = null;
        this.f9206h = f9198k;
        this.f9207i = null;
        this.f9199a = i8;
    }
}
