package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class T9 {

    /* renamed from: a, reason: collision with root package name */
    private static Cipher f19075a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f19076b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f19077c = new Object();

    public T9(SecureRandom secureRandom) {
    }

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f19077c) {
            try {
                if (f19075a == null) {
                    f19075a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f19075a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f19076b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return Y8.a(bArr3, false);
        } catch (InvalidKeyException e8) {
            throw new zzavh(this, e8);
        } catch (NoSuchAlgorithmException e9) {
            throw new zzavh(this, e9);
        } catch (BadPaddingException e10) {
            throw new zzavh(this, e10);
        } catch (IllegalBlockSizeException e11) {
            throw new zzavh(this, e11);
        } catch (NoSuchPaddingException e12) {
            throw new zzavh(this, e12);
        }
    }

    public final byte[] b(byte[] bArr, String str) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b8 = Y8.b(str, false);
            int length2 = b8.length;
            if (length2 <= 16) {
                throw new zzavh(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(b8);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f19076b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = c().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e8) {
            throw new zzavh(this, e8);
        } catch (InvalidAlgorithmParameterException e9) {
            throw new zzavh(this, e9);
        } catch (InvalidKeyException e10) {
            throw new zzavh(this, e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new zzavh(this, e11);
        } catch (BadPaddingException e12) {
            throw new zzavh(this, e12);
        } catch (IllegalBlockSizeException e13) {
            throw new zzavh(this, e13);
        } catch (NoSuchPaddingException e14) {
            throw new zzavh(this, e14);
        }
    }
}
