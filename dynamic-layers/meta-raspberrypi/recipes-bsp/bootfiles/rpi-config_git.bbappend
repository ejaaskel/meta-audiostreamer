do_deploy:append() {
    echo "# Enable audio (loads snd_bcm2835)" >> $CONFIG
    echo "dtparam=audio=on" >> $CONFIG

    sed 's/^dtoverlay/#&/' -i $CONFIG
}
