package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC3753pr extends AbstractC3970rr implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: J, reason: collision with root package name */
    private static final Map f25513J;

    /* renamed from: A, reason: collision with root package name */
    private int f25514A;

    /* renamed from: B, reason: collision with root package name */
    private int f25515B;

    /* renamed from: C, reason: collision with root package name */
    private int f25516C;

    /* renamed from: D, reason: collision with root package name */
    private C1498Kr f25517D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f25518E;

    /* renamed from: F, reason: collision with root package name */
    private int f25519F;

    /* renamed from: G, reason: collision with root package name */
    private InterfaceC3862qr f25520G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f25521H;

    /* renamed from: I, reason: collision with root package name */
    private Integer f25522I;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC1567Mr f25523t;

    /* renamed from: u, reason: collision with root package name */
    private final C1602Nr f25524u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f25525v;

    /* renamed from: w, reason: collision with root package name */
    private int f25526w;

    /* renamed from: x, reason: collision with root package name */
    private int f25527x;

    /* renamed from: y, reason: collision with root package name */
    private MediaPlayer f25528y;

    /* renamed from: z, reason: collision with root package name */
    private Uri f25529z;

    static {
        HashMap hashMap = new HashMap();
        f25513J = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC3753pr(Context context, InterfaceC1567Mr interfaceC1567Mr, boolean z7, boolean z8, Lr lr, C1602Nr c1602Nr) {
        super(context);
        this.f25526w = 0;
        this.f25527x = 0;
        this.f25521H = false;
        this.f25522I = null;
        setSurfaceTextureListener(this);
        this.f25523t = interfaceC1567Mr;
        this.f25524u = c1602Nr;
        this.f25518E = z7;
        this.f25525v = z8;
        c1602Nr.a(this);
    }

    private final void A(boolean z7) {
        AbstractC0608p0.k("AdMediaPlayerView release");
        C1498Kr c1498Kr = this.f25517D;
        if (c1498Kr != null) {
            c1498Kr.d();
            this.f25517D = null;
        }
        MediaPlayer mediaPlayer = this.f25528y;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f25528y.release();
            this.f25528y = null;
            B(0);
            if (z7) {
                this.f25527x = 0;
            }
        }
    }

    private final void B(int i8) {
        if (i8 == 3) {
            this.f25524u.c();
            this.f26225s.b();
        } else if (this.f25526w == 3) {
            this.f25524u.e();
            this.f26225s.c();
        }
        this.f25526w = i8;
    }

    private final void C(float f8) {
        MediaPlayer mediaPlayer = this.f25528y;
        if (mediaPlayer == null) {
            H2.p.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f8, f8);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean D() {
        int i8;
        return (this.f25528y == null || (i8 = this.f25526w) == -1 || i8 == 0 || i8 == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void G(TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue() || textureViewSurfaceTextureListenerC3753pr.f25523t == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap hashMap = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    textureViewSurfaceTextureListenerC3753pr.f25522I = valueOf;
                                    hashMap.put("bitRate", String.valueOf(valueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    hashMap.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    hashMap.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                hashMap.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                hashMap.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                textureViewSurfaceTextureListenerC3753pr.f25523t.D0("onMetadataEvent", hashMap);
            }
        } catch (RuntimeException e8) {
            C2.v.s().x(e8, "AdMediaPlayerView.reportMetadata");
        }
    }

    private final void z() {
        AbstractC0608p0.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f25529z == null || surfaceTexture == null) {
            return;
        }
        A(false);
        try {
            C2.v.o();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f25528y = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f25528y.setOnCompletionListener(this);
            this.f25528y.setOnErrorListener(this);
            this.f25528y.setOnInfoListener(this);
            this.f25528y.setOnPreparedListener(this);
            this.f25528y.setOnVideoSizeChangedListener(this);
            this.f25516C = 0;
            if (this.f25518E) {
                C1498Kr c1498Kr = new C1498Kr(getContext());
                this.f25517D = c1498Kr;
                c1498Kr.c(surfaceTexture, getWidth(), getHeight());
                this.f25517D.start();
                SurfaceTexture a8 = this.f25517D.a();
                if (a8 != null) {
                    surfaceTexture = a8;
                } else {
                    this.f25517D.d();
                    this.f25517D = null;
                }
            }
            this.f25528y.setDataSource(getContext(), this.f25529z);
            C2.v.p();
            this.f25528y.setSurface(new Surface(surfaceTexture));
            this.f25528y.setAudioStreamType(3);
            this.f25528y.setScreenOnWhilePlaying(true);
            this.f25528y.prepareAsync();
            B(1);
        } catch (IOException e8) {
            e = e8;
            H2.p.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f25529z)), e);
            onError(this.f25528y, 1, 0);
        } catch (IllegalArgumentException e9) {
            e = e9;
            H2.p.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f25529z)), e);
            onError(this.f25528y, 1, 0);
        } catch (IllegalStateException e10) {
            e = e10;
            H2.p.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f25529z)), e);
            onError(this.f25528y, 1, 0);
        }
    }

    final /* synthetic */ void J(int i8) {
        InterfaceC3862qr interfaceC3862qr = this.f25520G;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.onWindowVisibilityChanged(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int d() {
        if (D()) {
            return this.f25528y.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int e() {
        if (Build.VERSION.SDK_INT < 26 || !D()) {
            return -1;
        }
        return this.f25528y.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int f() {
        if (D()) {
            return this.f25528y.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int g() {
        MediaPlayer mediaPlayer = this.f25528y;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int h() {
        MediaPlayer mediaPlayer = this.f25528y;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final long i() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final long j() {
        if (this.f25522I != null) {
            return (k() * this.f25516C) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final long k() {
        if (this.f25522I != null) {
            return f() * this.f25522I.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr, com.google.android.gms.internal.ads.InterfaceC1672Pr
    public final void l() {
        C(this.f26225s.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final String m() {
        return "MediaPlayer".concat(true != this.f25518E ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void n() {
        AbstractC0608p0.k("AdMediaPlayerView pause");
        if (D() && this.f25528y.isPlaying()) {
            this.f25528y.pause();
            B(4);
            G2.D0.f2566l.post(new RunnableC3535nr(this));
        }
        this.f25527x = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void o() {
        AbstractC0608p0.k("AdMediaPlayerView play");
        if (D()) {
            this.f25528y.start();
            B(3);
            this.f26224o.b();
            G2.D0.f2566l.post(new RunnableC3426mr(this));
        }
        this.f25527x = 3;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i8) {
        this.f25516C = i8;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        AbstractC0608p0.k("AdMediaPlayerView completion");
        B(5);
        this.f25527x = 5;
        G2.D0.f2566l.post(new RunnableC2883hr(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
        Map map = f25513J;
        String str = (String) map.get(Integer.valueOf(i8));
        String str2 = (String) map.get(Integer.valueOf(i9));
        H2.p.g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        B(-1);
        this.f25527x = -1;
        G2.D0.f2566l.post(new RunnableC2991ir(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i8, int i9) {
        Map map = f25513J;
        AbstractC0608p0.k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i8))) + ":" + ((String) map.get(Integer.valueOf(i9))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f25514A
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f25515B
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f25514A
            if (r2 <= 0) goto L7a
            int r2 = r5.f25515B
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.Kr r2 = r5.f25517D
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.f25514A
            int r1 = r0 * r7
            int r2 = r5.f25515B
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.f25515B
            int r0 = r0 * r6
            int r2 = r5.f25514A
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f25514A
            int r1 = r1 * r7
            int r2 = r5.f25515B
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.f25514A
            int r4 = r5.f25515B
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.Kr r6 = r5.f25517D
            if (r6 == 0) goto L84
            r6.b(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC3753pr.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        AbstractC0608p0.k("AdMediaPlayerView prepared");
        B(2);
        this.f25524u.b();
        G2.D0.f2566l.post(new RunnableC2774gr(this, mediaPlayer));
        this.f25514A = mediaPlayer.getVideoWidth();
        this.f25515B = mediaPlayer.getVideoHeight();
        int i8 = this.f25519F;
        if (i8 != 0) {
            p(i8);
        }
        if (this.f25525v && D() && this.f25528y.getCurrentPosition() > 0 && this.f25527x != 3) {
            AbstractC0608p0.k("AdMediaPlayerView nudging MediaPlayer");
            C(0.0f);
            this.f25528y.start();
            int currentPosition = this.f25528y.getCurrentPosition();
            long a8 = C2.v.c().a();
            while (D() && this.f25528y.getCurrentPosition() == currentPosition && C2.v.c().a() - a8 <= 250) {
            }
            this.f25528y.pause();
            l();
        }
        H2.p.f("AdMediaPlayerView stream dimensions: " + this.f25514A + " x " + this.f25515B);
        if (this.f25527x == 3) {
            o();
        }
        l();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        AbstractC0608p0.k("AdMediaPlayerView surface created");
        z();
        G2.D0.f2566l.post(new RunnableC3099jr(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC0608p0.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f25528y;
        if (mediaPlayer != null && this.f25519F == 0) {
            this.f25519F = mediaPlayer.getCurrentPosition();
        }
        C1498Kr c1498Kr = this.f25517D;
        if (c1498Kr != null) {
            c1498Kr.d();
        }
        G2.D0.f2566l.post(new RunnableC3317lr(this));
        A(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
        AbstractC0608p0.k("AdMediaPlayerView surface changed");
        int i10 = this.f25527x;
        boolean z7 = false;
        if (this.f25514A == i8 && this.f25515B == i9) {
            z7 = true;
        }
        if (this.f25528y != null && i10 == 3 && z7) {
            int i11 = this.f25519F;
            if (i11 != 0) {
                p(i11);
            }
            o();
        }
        C1498Kr c1498Kr = this.f25517D;
        if (c1498Kr != null) {
            c1498Kr.b(i8, i9);
        }
        G2.D0.f2566l.post(new RunnableC3208kr(this, i8, i9));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f25524u.f(this);
        this.f26224o.a(surfaceTexture, this.f25520G);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i8, int i9) {
        AbstractC0608p0.k("AdMediaPlayerView size changed: " + i8 + " x " + i9);
        this.f25514A = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f25515B = videoHeight;
        if (this.f25514A == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i8) {
        AbstractC0608p0.k("AdMediaPlayerView window visibility changed to " + i8);
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.fr
            @Override // java.lang.Runnable
            public final void run() {
                this.f22121o.J(i8);
            }
        });
        super.onWindowVisibilityChanged(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void p(int i8) {
        AbstractC0608p0.k("AdMediaPlayerView seek " + i8);
        if (!D()) {
            this.f25519F = i8;
        } else {
            this.f25528y.seekTo(i8);
            this.f25519F = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void q(InterfaceC3862qr interfaceC3862qr) {
        this.f25520G = interfaceC3862qr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void r(String str) {
        Uri parse = Uri.parse(str);
        C1476Kc A02 = C1476Kc.A0(parse);
        if (A02 == null || A02.f16602o != null) {
            if (A02 != null) {
                parse = Uri.parse(A02.f16602o);
            }
            this.f25529z = parse;
            this.f25519F = 0;
            z();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void s() {
        AbstractC0608p0.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f25528y;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f25528y.release();
            this.f25528y = null;
            B(0);
            this.f25527x = 0;
        }
        this.f25524u.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void t(float f8, float f9) {
        C1498Kr c1498Kr = this.f25517D;
        if (c1498Kr != null) {
            c1498Kr.e(f8, f9);
        }
    }

    @Override // android.view.View
    public final String toString() {
        return TextureViewSurfaceTextureListenerC3753pr.class.getName() + "@" + Integer.toHexString(hashCode());
    }
}
