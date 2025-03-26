package A1;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import s1.EnumC6721a;
import s1.c;

/* loaded from: classes.dex */
public abstract class v {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f139a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f140b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f141c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f142d;

        static {
            int[] iArr = new int[s1.n.values().length];
            f142d = iArr;
            try {
                iArr[s1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f142d[s1.n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[s1.k.values().length];
            f141c = iArr2;
            try {
                iArr2[s1.k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f141c[s1.k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f141c[s1.k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f141c[s1.k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f141c[s1.k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC6721a.values().length];
            f140b = iArr3;
            try {
                iArr3[EnumC6721a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f140b[EnumC6721a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[s1.s.values().length];
            f139a = iArr4;
            try {
                iArr4[s1.s.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f139a[s1.s.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f139a[s1.s.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f139a[s1.s.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f139a[s1.s.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f139a[s1.s.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(EnumC6721a enumC6721a) {
        int i8 = a.f140b[enumC6721a.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC6721a + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s1.c b(byte[] r6) {
        /*
            s1.c r0 = new s1.c
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L17:
            if (r6 <= 0) goto L2f
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r0.a(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            r6 = move-exception
            goto L48
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L58
        L3b:
            r6 = move-exception
            r6.printStackTrace()
            goto L58
        L40:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L59
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L48:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.printStackTrace()
        L55:
            r1.close()     // Catch: java.io.IOException -> L3b
        L58:
            return r0
        L59:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r0.printStackTrace()
        L63:
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            r0.printStackTrace()
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.v.b(byte[]):s1.c");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0053 -> B:34:0x006a). Please report as a decompilation issue!!! */
    public static byte[] c(s1.c cVar) {
        ObjectOutputStream objectOutputStream = null;
        if (cVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeInt(cVar.c());
                        for (c.a aVar : cVar.b()) {
                            objectOutputStream2.writeUTF(aVar.a().toString());
                            objectOutputStream2.writeBoolean(aVar.b());
                        }
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e9) {
                        e = e9;
                        objectOutputStream = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream.toByteArray();
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e13) {
                e = e13;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static EnumC6721a d(int i8) {
        if (i8 == 0) {
            return EnumC6721a.EXPONENTIAL;
        }
        if (i8 == 1) {
            return EnumC6721a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to BackoffPolicy");
    }

    public static s1.k e(int i8) {
        if (i8 == 0) {
            return s1.k.NOT_REQUIRED;
        }
        if (i8 == 1) {
            return s1.k.CONNECTED;
        }
        if (i8 == 2) {
            return s1.k.UNMETERED;
        }
        if (i8 == 3) {
            return s1.k.NOT_ROAMING;
        }
        if (i8 == 4) {
            return s1.k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i8 == 5) {
            return s1.k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to NetworkType");
    }

    public static s1.n f(int i8) {
        if (i8 == 0) {
            return s1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i8 == 1) {
            return s1.n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to OutOfQuotaPolicy");
    }

    public static s1.s g(int i8) {
        if (i8 == 0) {
            return s1.s.ENQUEUED;
        }
        if (i8 == 1) {
            return s1.s.RUNNING;
        }
        if (i8 == 2) {
            return s1.s.SUCCEEDED;
        }
        if (i8 == 3) {
            return s1.s.FAILED;
        }
        if (i8 == 4) {
            return s1.s.BLOCKED;
        }
        if (i8 == 5) {
            return s1.s.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i8 + " to State");
    }

    public static int h(s1.k kVar) {
        int i8 = a.f141c[kVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 == 4) {
            return 3;
        }
        if (i8 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && kVar == s1.k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + kVar + " to int");
    }

    public static int i(s1.n nVar) {
        int i8 = a.f142d[nVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + nVar + " to int");
    }

    public static int j(s1.s sVar) {
        switch (a.f139a[sVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + sVar + " to int");
        }
    }
}
